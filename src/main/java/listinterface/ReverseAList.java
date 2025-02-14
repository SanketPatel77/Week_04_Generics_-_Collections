package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseAList {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        // call method to reverse ArrayList
        reverseArrayList(arrayList);
        // print reversed ArrayList
        System.out.println(arrayList);

        // call method to reverse LinkedList
        reverseLinkedList(linkedList);
        // print reversed LinkedList
        System.out.println(linkedList);

    }

    // Method to reverse an ArrayList without built-in reverse method
    public static <T> void reverseArrayList(ArrayList<T> list) {
        // reverse ArrayList with 2 pointer approach
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements at left and right indices
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Method to reverse a LinkedList without built-in reverse method
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        // reverse LinkedList with 2 pointer approach
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements at left and right indices
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }


}
