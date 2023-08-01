package org.example.Queue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pqueue {

    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();
        /*Queue<Integer> numbers =new ArrayBlockingQueue<>(4);*/

        // offer elements to the Queue
        numbers.offer(44);
        numbers.offer(21);
        numbers.offer(50);
        numbers.offer(23);

        System.out.println("Queue: " + numbers);

      /*  boolean  q =numbers.add(33);
        System.out.println("is number is stored in queue:"+q);
        System.out.println(numbers);*/

        int pn = numbers.peek();
        System.out.println( pn);


        int rn = numbers.poll();
        System.out.println(rn);

       int el = numbers.element();
       System.out.println(el);
        System.out.println( numbers);
    }
}

