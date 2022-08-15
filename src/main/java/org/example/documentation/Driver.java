package org.example.documentation;

public class Driver{
    String fullName;
    public int drivingExperience;

    public Driver (String fullName, int drivingExperience){
        this.fullName = fullName;
        this.drivingExperience= drivingExperience;
    }
    public void showInfo(){
        String showInfo = fullName + " " + drivingExperience;
        System.out.println("Here is information about driver: \n" + showInfo);
    }
}
