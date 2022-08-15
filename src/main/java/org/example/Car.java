package org.example;

import org.example.documentation.Driver;
import org.example.technic.Engine;

public class Car {
    protected String mark;
    protected String clas;
    protected double weight;
    public Driver driver;
    public Engine engine;


    public void start(){
        System.out.println("Lets rock!");
    }
    public void stop(){
        System.out.println("Cool down, babe, he-he.");
    }
    public void turnRight(){
        System.out.println("Turn right, not left, you morron!");
    }
    public void turnLeft(){
        System.out.println("Turn left, not right, you idiot!");
    }

        public Car(String mark, String clas, double weight){
        this.mark = mark;
        this.clas = clas;
        this.weight = weight;
    }


    public void printInfo(){
        System.out.println("Here is all information you asked for: \n" + mark + "\n" + clas + "\n" + weight+ "\n");

    }

}
