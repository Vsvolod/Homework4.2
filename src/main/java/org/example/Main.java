package org.example;

import org.example.CARS.SportCar;
import org.example.documentation.Driver;
import org.example.documentation.Person;
import org.example.technic.Engine;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", "SportCar", 0.7);
        Driver vasyan = new Driver("Vasyan Kolyanovich Kozibyaka", 10);
        Engine d1000 = new Engine ("dydya vasya", "kon perekon");
        nissan.printInfo();
        d1000.showInfo();
        vasyan.showInfo();
        nissan.start();
    }
}
