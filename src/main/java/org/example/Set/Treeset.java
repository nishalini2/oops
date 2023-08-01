package org.example.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[]args){
        Set<String> t1=new TreeSet<>();
        t1.add("orange");
        t1.add("apple");
        t1.add("mango");
        t1.add("pineapple");
        t1.add("cucumber");
        System.out.println(t1);

      /*  Set<String> t2=new TreeSet<>();
        t2.add("onion");
        t2.add("tomato");
        t2.add("mango");
        t2.add("lemon");
        t2.add("ladysfinger");*/

        TreeSet<String> t3=new TreeSet<>();
        t3.add("graphes");

        t3.addAll(t1);
        System.out.println(t3);

        //higher
        System.out.println( t3.higher("orange"));

        System.out.println( t3.lower("orange"));

        System.out.println( t3.ceiling("xentrix"));

        System.out.println( t3.floor("pineapple"));

 /*for(String fruits:t1)
     System.out.println(fruits);*/

        /*Iterator<String>t=t1.iterator();
        System.out.println(t.next());
        while(t.hasNext())
            System.out.println(t.next());*/

        /*System.out.println(t1.size());
        System.out.println(t1.contains("mango"));*/

      /*  t1.clear();
        System.out.println(t1);*/

        /*System.out.println(t1.remove("mango"));

        System.out.println(t1.isEmpty());

        System.out.println(t1.hashCode());*/

        /*t1.retainAll(t2);
        System.out.println(t1);*/



    }
}
