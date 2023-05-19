package org.example;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_RANGE = 100;

    private int[][] matrix;
    private int width;
    private int height;

    public static void main(String[] args) {
        MatrixOperations matrixOperations = new MatrixOperations();
        matrixOperations.run();
    }

    public void run() {
        inputMatrixSize();
        createMatrix();
        printMatrix();
        findMinMax();
        calculateAverage();

    }

    private void inputMatrixSize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ширину матриці (не більше " + MAX_SIZE + "): ");
        width = scanner.nextInt();

        System.out.print("Введіть висоту матриці (не більше " + MAX_SIZE + "): ");
        height = scanner.nextInt();
    }

    private void createMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        matrix = new int[height][width];

        System.out.println("Оберіть спосіб заповнення матриці:");
        System.out.println("1. Введіть елементи вручну");
        System.out.println("2. Заповнити випадковими числами");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("Елемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = random.nextInt(RANDOM_RANGE);
                    }
                }
                break;
            default:
                System.out.println("Некоректний вибір. Заповнюю матрицю випадковими числами.");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = random.nextInt(RANDOM_RANGE);
                    }
                }
                break;
        }
    }

    private void printMatrix() {
        System.out.println("Матриця:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private void calculateAverage() {
        int sum = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
            }
        }

        double average = (double) sum / (width * height);
        System.out.println("Середнє арифметичне: " + average);
    }
    private void findMinMax() {
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}

