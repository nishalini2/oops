package org.example.Abstraction;

public  class Mountainbike extends MotorBike {
    public void brake() {
        System.out.println("MountainBike brake");
    }


    public void mileage() {
        System.out.println("Above 20");
    }
    public static void main(String []args){
        Mountainbike obj=new Mountainbike();
        obj.brake();
        obj.mileage();
       /* obj.customer();*/

    }

   /* @Override
    public void customer() {
        System.out.println("splender");
    }*/
}

