//package com.itcourses.grusha.Objects.Carshop;

public class Passat {
    private static int passatNumbers;

    public double engineDisplacement;
    public String engineType;
    public int topSpeed;

    {
        passatNumbers++;
    }

    public Passat(double engineDisplacement, String engineType, int topSpeed) {

        this.engineDisplacement = engineDisplacement;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
        System.out.println("3 parameters constructor");
    }

    public Passat(String engineType, double engineDisplacement, int topSpeed){
        this(engineDisplacement,engineType, topSpeed);
    }

    public Passat(int topSpeed)
    {
        this(123,"DieselXYZ",topSpeed);

    }



    public Passat(){
        getEngineType();
    }

    public static int getPassatNumbers() {
        return passatNumbers;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return engineDisplacement + " " + engineType + " " + " with top speed " + topSpeed;
    }

}
