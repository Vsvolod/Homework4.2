package org.example;

public class SportCar extends Car{

    int maxSpeed;

    public SportCar(String mark, String clas, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(mark, clas, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
