package org.example.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
public static void main(String[]args){
    Deque<String> Dq =new ArrayDeque<>();
    Dq.addFirst("priya");
    Dq.addLast("navi");
    Dq.offer("harshini");
    Dq.offerLast("malar");
    Dq.offerFirst("jai");
    Dq.push("Monica");
    System.out.println(Dq);

  /*  for(String dp:Dq)
    System.out.println(dp);*/

    String pn = Dq.peek();
    System.out.println(pn);


    String pl=Dq.peekLast();
    System.out.println(pl);


    String pf=Dq.pollFirst();
    System.out.println(pf);


}
}
