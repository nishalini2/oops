package org.example.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String args[]){
/*        LinkedHashSet<Integer>l1=new LinkedHashSet<>();
        for(int l=0;l<=5;l++)
            l1.add(l);
        System.out.println(l1);*/
Set<String> l2=new LinkedHashSet<>();
l2.add("a");
l2.add("z");
l2.add("b");
l2.add("y");
l2.add("c");
l2.add("x");
System.out.println(l2);
        Set<String> l3=new LinkedHashSet<>();
        l3.add("a");
        l3.add("w");
        l3.add("e");
        l3.add("v");
        l3.add("f");
        l3.add("u");

/*       System.out.println(l2.contains("z"));
       System.out.println(l2.remove("a"));
        System.out.println(l2.size());*/
        /*l2.retainAll(l3);
        System.out.println(l2);*/
        /*l2.clear();
        System.out.println(l2);*/
     /*System.out.println(l2.isEmpty());*/
      /*  Iterator<String> h=l2.iterator();
        System.out.println(h.next());
        while (h.hasNext());
        System.out.println(h.next());*/
       /* System.out.println(l2.hashCode());*/

    }

}