package setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        // create first set
        Set<Integer> set1 = new HashSet<>();
        // add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // create second set
        Set<Integer> set2 = new HashSet<>();
        // add element to set2
        set2.add(3);
        set2.add(10);
        set2.add(5);
        set2.add(6);

        // call findUnion method to display union of sets
        findUnion(set1,set2);

        // call findIntersection method to display intersection of sets
        findIntersection(set1,set2);
    }

    // method to find union
    public static <T> void findUnion(Set<T> set1, Set<T> set2){
        // create a set to hold union
        Set<T> union = new HashSet<>();

        union.addAll(set1); // add all data of set1 to union set
        union.addAll(set2); // add all data of set2 to union set

        // print union set
        System.out.println(union);
    }

    //    method to find intersection
    public static <T> void findIntersection(Set<T> set1, Set<T> set2){
        // create intersection set
        Set<T> intersection = new HashSet<>();

//        iterate on set2 and check for intersection
        for (T item : set2) {
            if (set1.contains(item)) {
                intersection.add(item);
            }
        }
        // print intersection set
        System.out.println(intersection);
    }
}

