package lab3.cont;
import lab3.mod.*;
public class FacultyCreator implements Creator<Faculty> {
    @Override
    public Faculty create(String name, Human header) {
        return new Faculty(name, header);
    }
}
