package exceptionhandling.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input array
        System.out.println("Enter size off array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter elements to array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Prompt the user for input
        System.out.print("Enter the index of the array: ");
        int index = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        try {
            // Access the array element at the specified index
            int element = arr[index];

            // Inner try block to handle ArithmeticException
            try {
                // Perform division
                int result = element / divisor;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid array index
            System.out.println("Invalid array index!");
        }

        sc.close();
    }

}
