package L8_Java_Collection_Framework_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        // HashedSet -> O(1)
        // LinkedHashedSet -> O(n)
        // TreeSet -> BST -> O(logn)

        Set<Integer> st = new HashSet<>();
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println("st " + st);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("set1 " + set1);

        // retainAll: only keep the intersection elements
        set1.retainAll(set2);
        System.out.println("set1 retainAll " + set1);

        // contains all : does all the elements form one set presents in another
        System.out.println("set2 " + set2);
        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));

        // LinkedHashSet: to preserve order
        Set<Integer> st2 = new LinkedHashSet<>();
        st2.add(40);
        st2.add(10);
        st2.add(10);
        st2.add(10);
        st2.add(10);
        st2.add(10);
        st2.add(20);
        st2.add(20);
        st2.add(30);

        System.out.println("st2 " + st2);

        // treeset: to store in sorted order
        Set<Integer> st3 = new TreeSet<>();
        st3.add(40);
        st3.add(10);
        st3.add(10);
        st3.add(10);
        st3.add(10);
        st3.add(10);
        st3.add(20);
        st3.add(20);
        st3.add(30);

        System.out.println("st3 " + st3);
    }
}
