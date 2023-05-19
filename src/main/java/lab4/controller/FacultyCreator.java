package lab4.controller;
import lab4.model.*;
public class FacultyCreator implements Creator<Faculty> {
    @Override
    public Faculty create(String name, Human header) {
        return new Faculty(name, header);
    }
}
