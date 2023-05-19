package org.example.cont;
import org.example.mod.*;
public interface Creator<T> {
    T create(String name, Human header);
}
