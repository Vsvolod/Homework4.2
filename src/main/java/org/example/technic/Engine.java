package org.example.technic;

public class Engine{
   String power;
   String fabricator;

   public Engine (String power, String fabricator) {
       this.power = power;
       this.fabricator = fabricator;
    }
    public void showInfo(){
        String showInfo = power + " " + fabricator;
        System.out.println("Here is information about engine: \n" + showInfo);
    }
}
