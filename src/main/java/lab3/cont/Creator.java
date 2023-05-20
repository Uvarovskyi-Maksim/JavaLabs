package lab3.cont;
import lab3.mod.*;
public interface Creator<T> {
    T create(String name, Human header);
}
