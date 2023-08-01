package org.example.Polymorphism;


    public class Sportsbike extends Motorbike {

        @Override
        public void brake () {
            System.out.println("Flexible brake");
        }

        @Override
        public void gear () {
            System.out.println("Flexible gear");
        }
        public static void main(String[]args) {
            Sportsbike sb=new Sportsbike();
            sb.brake();
            sb.gear();
        }

}
