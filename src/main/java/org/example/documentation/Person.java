package org.example.documentation;

import org.example.documentation.Driver;

public class Person extends Driver {
    public String fullName;
    int age;

    public Person(int drivingExperience, String fullName) {
        super(fullName, drivingExperience);
    }

    public void Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

}
