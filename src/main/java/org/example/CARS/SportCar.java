package org.example.CARS;

import org.example.Car;
import org.example.documentation.Driver;
import org.example.technic.Engine;

public class SportCar extends Car {

    int maxSpeed;


    public SportCar(String mark, String clas, double weight, int maxSpeed) {
        super(mark, clas, weight);
        this.maxSpeed = maxSpeed;
    }
}
