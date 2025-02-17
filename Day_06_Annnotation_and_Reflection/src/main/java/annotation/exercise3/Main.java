package annotation.exercise3;

import java.util.ArrayList;

public class Main {
    // Suppress unchecked warnings for this method
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create an ArrayList without generics
        ArrayList list = new ArrayList();

        // Add elements of different types (no type safety)
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        // Print the elements
        for (Object item : list) {
            System.out.println(item);
        }
    }
}