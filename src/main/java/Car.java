package main.java;

public class Car extends Transport {
    private double price;

    public Car() {
        super.setName("Toyota");
        super.setSpeed(40);
        super.setYearMake(2000);
    }

    public Car(String name, int speed, int yearMake) {
        super.setName(name);
        super.setSpeed(speed);
        super.setYearMake(yearMake);
    }

    public Car(String name, int speed, int yearMake, double price) {
        super(name, speed, yearMake);
        this.price = price;
    }

    public void printName() {
        System.out.println(super.getName());
    }
}
