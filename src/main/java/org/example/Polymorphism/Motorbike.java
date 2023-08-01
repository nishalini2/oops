package org.example.Polymorphism;

public abstract class Motorbike {

    public abstract void brake();

    public abstract void gear();

    public class MotorBike {
        public void brake(){
            System.out.println("Fixed brake");
        }
        public void gear(){
            System.out.println("Fixed gear");
        }
    }
}
