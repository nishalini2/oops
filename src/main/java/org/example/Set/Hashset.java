package org.example.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset{
    public static void main(String args[]){
        Set<String> h1=new<String>HashSet();
        h1.add("saravanan");
        h1.add("sathish");
        h1.add("sangeetha");
        h1.add("hari");
        h1.add("nisha");
        h1.add("sangeetha");
        h1.add("sita");
        System.out.println(h1);

       /* Set<String> h2=new<String>HashSet();
        h2.add("saravanan");
        h2.add("sathish");
        h2.add("sangeetha");
        h2.add("hari");
        h2.add("nisha");
        h2.add("sangeetha");
        h2.add("sita");
*/
           //ordered the list
        for(String name:h1)
            System.out.println(name);

          // getting the size of list
        System.out.println(h1.size());

          //the element is contain or not and containsall
        System.out.println(h1.contains("nisha"));
           //clear the list
        h1.clear();

            /*//remove the element
       h1.remove("hari");
        System.out.println(h1);*/

           // list is empty or not
     /*   System.out.println(h1.isEmpty());*/

          /*//sum of the elements
     System.out.println(h1.hashCode());*/

          /* //retain the element
        h1.retainAll(h2);
        System.out.println(h1);*/

          // getting the list in 1st element
        Iterator<String> h=h1.iterator();
        System.out.println(h.next());

          // getting the list in given order
         while(h.hasNext()){
            System.out.println(h.next());
        }


/*Set<Integer>h3=new HashSet<>();
h3.add(1);
        h3.add(2);
        h3.add(3);
        h3.add(4);
        System.out.println(h3);*/

        /*//sum of list
        System.out.println(h3.hashCode());*/

    }
}
