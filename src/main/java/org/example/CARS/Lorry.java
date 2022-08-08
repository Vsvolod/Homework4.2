package org.example;

public class Lorry extends Car{

    int carrying;


    public Lorry(String mark, String clas, double weight, Driver driver, Engine engine, int carrying) {
        super(mark, clas, weight, driver, engine);
        this.carrying = carrying;
    }
}
