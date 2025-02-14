package queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        // create variable n
        int n = 5;

        // call getAllBinaryNumbers method to generate binary 1 to n number, it returns Queue<String>
        Queue<String> result = getAllBinaryNumbers(n);

        // print the result
        System.out.println(result);
    }

    // method to generate binary for each number
    public static String getBinary(int n){
        String binary = ""; // Empty string binary to store binary of number

        //logic to find binary of number
        while(n > 0){
            int remainder = n % 2;
            binary = remainder + binary;
            n /= 2;
        }

        // return binary
        return binary;
    }

    // method to get binary number from 1 to n
    public static Queue<String> getAllBinaryNumbers(int n){
        // create Queue
        Queue<String> queue = new LinkedList<>();

        // store all binary number from 1 to n into Queue
        for (int i = 1; i <= n ; i++){
            queue.offer(getBinary(i));
        }

        // return Queue of type string
        return queue;
    }
}
