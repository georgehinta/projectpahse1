package org.example;
//abstract factory interface creating type T
public interface AbstractFactory<T> {
    T create(String createSomething);
}
