package main.java;

public class Transport {
    private String name;
    private int speed;
    private int yearMake;

    public Transport(){
        this.name = "Infinity";
    }

    public Transport(String name, int speed, int yearMake) {
        this.name = "Infinity";
        this.speed = speed;
        this.yearMake = yearMake;
    }

    public Transport(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }
}
