package lab4.controller;
import lab4.model.*;
public class DepartmentCreator implements Creator<Department> {
    @Override
    public Department create(String name, Human header) {
        return new Department(name, header);
    }
}
