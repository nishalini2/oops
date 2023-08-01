package org.example.Abstraction;

public class Sportsbike extends MotorBike {
    public void brake() {
        System.out.println("SportsBike Brake");
    }

    public void mileage() {
        System.out.println("Below 20");
    }

    public static void main(String[] args) {
        Sportsbike obj1 = new Sportsbike();
        obj1.brake();
        obj1.mileage();

    }
}
