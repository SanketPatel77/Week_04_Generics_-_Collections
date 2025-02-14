package setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetToSortedList {
    public static void main(String[] args) {
        // Declaring the first hashset, does not maintain the order
        HashSet<Integer> set = new HashSet<>();
        // Adding the elements
        set.add(23);
        set.add(34);
        set.add(56);
        set.add(1);
        set.add(78);
        set.add(11);

        // Method calling for get result as sorted list
        List<Integer> list = getSortedList(set);

        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }
    }

    // Method definition for the sorting into the list
    public static <T extends Comparable<T>> List<T> getSortedList(HashSet<T> set) {
        List<T> sortedList = new ArrayList<>();

        for (T element : set) {
            int index = 0;

            for (index = 0; index < sortedList.size(); index++) {
                if (element.compareTo(sortedList.get(index)) < 0) {
                    break;
                }
            }

            sortedList.add(index, element);
        }

        return sortedList;
    }
}