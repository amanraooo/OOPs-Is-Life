package L8_Java_Collection_Framework_2;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        // offer: to add elements
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        System.out.println("q1 "+q1);

        //poll : to remove, it removes from first
        q1.poll();
        System.out.println("q1 "+q1);

        //peek: to access element at first
        System.out.println("q1 peek "+q1.peek());


    }
}
