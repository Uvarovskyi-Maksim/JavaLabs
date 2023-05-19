package lab4.controller;
import lab4.model.*;
public interface Creator<T> {
    T create(String name, Human header);
}
