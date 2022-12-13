import main.java.Car;
import main.java.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    ============= Homework Java Class 22 Nov =============
//    Create three classes of your choice and have a parent-child relationship with them
//    Create three types of Constructor in Parent class and child class both (Total six Constructor)
//    Create a MainClass and create six different object using each Constructor, check the output
//    Call Constructor  internally using this and super keyword, and check the output, do more brainstorming by changing different statement


    public static void main(String[] args) {
        Car transport = new Car("BWM", 240, 2020, 78000);
        transport.printName();
    }

    // What is the difference between class and object? Set of rules to build a house.
    // Architecture plan has the vision on how the house should look like.
    // Object would be the actual house you build from that architecture plan
}
