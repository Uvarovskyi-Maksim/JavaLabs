package lab3.cont;
import lab3.mod.*;
public class GroupCreator implements Creator<Group> {
    @Override
    public Group create(String name, Human header) {
        return new Group(name, header);
    }
}
