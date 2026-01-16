package L7_Java_Collection_Framework_1;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        // most of the methods we used for linkedlist can slso work with stack
        Stack<Integer> s1 = new Stack<>();

        // push : to add element at top of stack
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println("s1 " + s1);

        // pop: remove from top most
        s1.pop();
        System.out.println("s1 " + s1);

        // peek: look at top most
        s1.peek();
        System.out.println("s1 " + s1);

        // search: to search
        System.out.println(s1.search(1));
        System.out.println(s1.search(2));
        System.out.println(s1.search(111));

        // empty : to check if stack is empty
        System.out.println(s1.empty());
    }
}
