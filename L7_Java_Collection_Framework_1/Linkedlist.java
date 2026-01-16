package L7_Java_Collection_Framework_1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        // most of the methods we used for ArrayList also works for LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();

        // add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("list1 " + list1);

        // remove
        list1.remove(0);
        System.out.println("list1 " + list1);

        // addAll :add elements from one to another
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(11);
        list2.add(12);
        list2.add(13);
        System.out.println("list2 " + list2);

        list1.addAll(list2);
        System.out.println("list1 " + list1);

        // removeAll : to reverse the functions of addAll
        list1.removeAll(list2);
        System.out.println("list1 " + list1);

        // size
        System.out.println("list1 size " + list1.size());

        // clear :empties a list
        System.out.println("list2 " + list2);
        list2.clear();
        System.out.println("list2 size " + list2.size());

        // Iterator : a standard way to traverse over LinkedList
        Iterator<Integer> iterator = list1.iterator();
        // hasNext(): checks if next element exists and returns true or false
        while (iterator.hasNext()) {
            // next(): to access next element
            System.out.println("Element " + iterator.next());
        }

        // get:fetch element
        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(101);
        list3.add(201);
        list3.add(301);
        list3.add(401);
        System.out.println("list3 " + list3);

        System.out.println("list3 get " + list3.get(3));

        // set: update an element on index
        System.out.println("list3 " + list3);
        list3.set(0, 100);
        System.out.println("list3 " + list3);

        // toArray: converts a collection into array
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println("toArray " + obj);
        }

        // contains(): checks avilability
        System.out.println(list3.contains(100));
        System.out.println(list3.contains(12345));

        // sort:sorts the list
        LinkedList<Integer> list4 = new LinkedList<>();

        list4.add(101);
        list4.add(2);
        list4.add(0);
        list4.add(33);
        System.out.println("list4 " + list4);

        Collections.sort(list4);
        System.out.println("list4 sort " + list4);

        // ensureCapacity(): can define minimum size of arrayList
        LinkedList<Integer> marksList = new LinkedList<>();

        // isEmpty(): checks if list is empty
        System.out.println(marksList.isEmpty());
        System.out.println(list4.isEmpty());

        // indexOf(): fetch the index of a specific element
        System.out.println("list1 " + list1);
        System.out.println(list1.indexOf(2));

        // lastIndexOf : to find last occurannce index of a element
        LinkedList<Integer> list5 = new LinkedList<>();
        list5.add(10);
        list5.add(2);
        list5.add(2);
        list5.add(33);
        list5.add(2);
        list5.add(7);
        System.out.println("list5 " + list5);
        System.out.println(list5.lastIndexOf(2));

    }
}
