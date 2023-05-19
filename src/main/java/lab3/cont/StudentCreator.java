package org.example.cont;
import org.example.mod.*;
public class StudentCreator implements Creator<Student> {
    @Override
    public Student create(String name, Human header) {
        return new Student(name, header.getFirstName(), header.getLastName(), header.getParentage(), header.getGender());
    }
}
