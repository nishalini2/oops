package org.example.Set;

import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[]args){
        TreeSet<Integer>t=new TreeSet<>();
        t.add(2);
        t.add(4);
        t.add(6);
        t.add(8);
        System.out.println(t);
        System.out.println(t.higher(3));
        System.out.println(t.lower(2));
        System.out.println(t.ceiling(7));
        System.out.println(t.floor(3));
        System.out.println(t.headSet(6));//without 6
        System.out.println(t.headSet(6,true));//with 6
        System.out.println(t.tailSet(2));//with 2
        System.out.println(t.tailSet(2,false));//without 2
        System.out.println(t.subSet(2,8));// with 2 to 6
        System.out.println(t.subSet(2,false,8,true));

    }
}
