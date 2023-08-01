package org.example.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class ArrayListTest {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Orange");
        list.add("Banana");
        list.add("Mango");
        list.add("Watermelon");
        list.add("Papaya");
        System.out.println(list);



      /*     //add the string element
        list.add(0, "Banana");
          list.add("Grapes");
       System.out.println(list);*/

          /*  // update the String element
        list.set(0,"Banana");
        System.out.println(list);
*/
         /*   //get the string element
        System.out.println(list.get(3));
        System.out.println(list.get(1));
        System.out.println(list);
*/

        //getting the 1st element
        /*Iterator<String> h1=list.listIterator();
        System.out.println(h1.Next());*/

        //getting the size of the list
        /*System.out.println(list.size());/

        //clear the list
       /* list.clear();
        System.out.println(list);*/


        /*    // print the String element in order
        for(String name:list)
            System.out.println(name);*/


        /*   //remove string  element
        list.remove(5);
        System.out.println(list);*/


        /*ArrayList<Integer> alist=new ArrayList<Integer>();//flexible size
        for (int n=0;n<=10;n++)
            alist.add(n);
        System.out.println(alist);*/

        //update the integer element
     /*   alist.set(0,200);
        System.out.println(alist);*/


        //get the integer element
        /*System.out.println(alist.get(1));
         */

        //print the integer element in order
       /* for (int n:alist)
            System.out.println(n);
        */


         /*    //remove the integer element
        alist.remove(5);
        System.out.println(alist);*/



      /*  ArrayList<String> arList = new ArrayList<>();
        arList.add("Apple");
        arList.add("Orange");
        arList.add("Mango");

           //add all string element in arrlist
        list.addAll(0, arList);
        System.out.println(arList);
*/
    }
}