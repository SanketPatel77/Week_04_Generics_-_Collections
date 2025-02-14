package setinterface;

import java.util.HashSet;
import java.util.Set;

public class CheckForEqual {
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
        set2.add(2);
        set2.add(1);
        set2.add(4);

        // call method to compare sets
        boolean result = checkEqual(set1,set2);
        // print result
        System.out.println(result);
    }

    public static <T> boolean checkEqual(Set<T> set1, Set<T> set2){
        return set1.equals(set2); // return true if sets are equal else false
    }
}
