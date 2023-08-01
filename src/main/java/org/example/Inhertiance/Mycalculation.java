package org.example.Inhertiance;

public class Mycalculation extends Calculation {
    public void multplication(int x, int y) {
        z = x * y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        int x=20;
        int y=30;
        Mycalculation inher=new Mycalculation();
        inher.addition(x,y);
        inher.substraction(x,y);
        inher.multplication(x,y);
    }
}
