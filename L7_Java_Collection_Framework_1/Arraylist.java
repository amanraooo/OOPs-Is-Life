package L7_Java_Collection_Framework_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        
        //2 more ways to implement ArrayList
        // List<Integer> list1 = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        //add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("list1 "+list1);

        //remove
        list1.remove(0);
        System.out.println("list1 "+list1);

        //addAll :add elements from one to another
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(11);
        list2.add(12);
        list2.add(13);
        System.out.println("list2 "+list2);

        list1.addAll(list2);
        System.out.println("list1 "+list1);

        //removeAll : to reverse the functions of addAll
        list1.removeAll(list2);
        System.out.println("list1 "+list1);

        //size
        System.out.println("list1 size "+list1.size());

        //clear :empties a list
        System.out.println("list2 "+list2);
        list2.clear();
        System.out.println("list2 size "+list2.size());

        //Iterator : a standard way to traverse over ArrayList
        Iterator<Integer> iterator = list1.iterator();
        //hasNext(): checks if next element exists and returns true or false
        while(iterator.hasNext()){
        //next(): to access next element
            System.out.println("Element "+ iterator.next());
        }

        //get:fetch element
        ArrayList<Integer> list3 = new ArrayList<>(); 

        list3.add(101);
        list3.add(201);
        list3.add(301);
        list3.add(401);
        System.out.println("list3 "+list3);

        System.out.println("list3 get "+list3.get(3));

        //set: update an element on index
        System.out.println("list3 "+list3);
        list3.set(0, 100);
        System.out.println("list3 "+list3);

        //toArray: converts a collection into array
        Object[] arr= list3.toArray();
        for (Object obj : arr) {
            System.out.println("toArray "+obj);
        }

        //contains(): checks avilability
        System.out.println(list3.contains(100));
        System.out.println(list3.contains(12345));

    }
}
