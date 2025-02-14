package setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Declaring the first hashset, does not maintain the order
        HashSet<Character> set1 = new HashSet<>();
        // Adding the elements
        set1.add('a');
        set1.add('z');
        set1.add('f');

        // Declaring the second hashset
        HashSet<Character> set2 = new HashSet<>();
        // Adding the element
        set2.add('z');
        set2.add('f');
        set2.add('c');
        set2.add('b');

        getSetDifference(set1, set2);
    }

    public static <T> void getSetDifference(HashSet<T> set1, HashSet<T> set2) {
        // Hashset for getting the two set difference
        HashSet<T> result = new HashSet<>(set1);

        // Iterating the set2 and removing if present already otherwise adding in set
        Iterator<T> itr = set2.iterator();
        while(itr.hasNext()) {
            T element = itr.next();

            if(result.contains(element)) {
                result.remove(element);
            } else result.add(element);
        }

        // Iterating the result hashset
        itr = result.iterator();

        // Printing the result
        System.out.print("Element in set after getting the set difference is: ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
    }
}