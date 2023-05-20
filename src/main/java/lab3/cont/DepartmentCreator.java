package lab3.cont;
import lab3.mod.*;
public class DepartmentCreator implements Creator<Department> {
    @Override
    public Department create(String name, Human header) {
        return new Department(name, header);
    }
}
