package lab5;
import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        try {
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student");
            System.out.println("Connected to the database!");

           
            int month = 5; 

            
            String sql = "SELECT * FROM students WHERE MONTH(date_of_birth) = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            
            System.out.println("\nStudents born in month " + month + ":");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String patronymic = resultSet.getString("patronymic");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                String recordBookNumber = resultSet.getString("record_book_number");

                System.out.println("ID: " + id);
                System.out.println("Last Name: " + lastName);
                System.out.println("First Name: " + firstName);
                System.out.println("Patronymic: " + patronymic);
                System.out.println("Date of Birth: " + dateOfBirth);
                System.out.println("Record Book Number: " + recordBookNumber);
                System.out.println();
            }

           
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error occurred while connecting to the database!");
            e.printStackTrace();
        }
    }
}
