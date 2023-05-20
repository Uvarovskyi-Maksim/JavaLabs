package lab3.cont;
import lab3.mod.*;
public class StudentCreator implements Creator<Student> {
    @Override
    public Student create(String name, Human header) {
        return new Student(name, header.getFirstName(), header.getLastName(), header.getParentage(), header.getGender());
    }
}
