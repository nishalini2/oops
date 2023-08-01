package org.example.Polymorphism;

public class Arithmetic {
    public void add(int a, int b){
        int c =a+b;
        System.out.println("Sum of the numbers:"+c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Sum of three numbers:"+d);
    }
    public void add(int a, int b,int c,int d){
        int e=a+b+c+d;
        System.out.println("Sum of four numbers:"+e);
    }
    public static void main(String[]args){
        Arithmetic a=new Arithmetic();
        a.add(12,45);
        a.add(15,30,30);
        a.add(2,10,3,21);
    }
}