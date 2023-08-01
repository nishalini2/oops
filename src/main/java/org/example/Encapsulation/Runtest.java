package org.example.Encapsulation;

public class Runtest {
    public static void main(String []args){
        Test t=new Test();
        t.setName("Nisha");
        t.setAge("21");
        t.setId(01);
        System.out.println("Name: "+ t.getName());
        System.out.println("Age: "+ t.getAge());
        System.out.println("id: "+ t.getId());
    }
}
