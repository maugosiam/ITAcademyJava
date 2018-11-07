//package com.itcourses.grusha.Objects.Carshop;

public class CarShop {
    public static void main(String[] args) {
        Passat simplePassat = new Passat();
        Passat anotherPassat = new Passat(1);
        new Passat(2,"",2);

        simplePassat.engineDisplacement = 1.4;
        simplePassat.topSpeed = 180;
        simplePassat.engineType = "Petrol";

        System.out.println("This passat is " + simplePassat);
        System.out.println("This passat is " + anotherPassat);


    }
}
