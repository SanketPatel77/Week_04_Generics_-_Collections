package exceptionhandling.finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        // scanner obj
        Scanner scanner = new Scanner(System.in);

        //Take two integers from the user.
        System.out.println("Enter 2 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Perform division.
        try {
            //Handle ArithmeticException (if dividing by zero).
            int c = a / b;
            System.out.println("answer is : "+c);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // will run regardless of exception
        finally {
            System.out.println("Operation completed");
        }
    }
}
