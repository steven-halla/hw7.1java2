import java.util.Scanner;

public class Fibonacci {
    // Add a static variable to keep track of the number of calls
    public static long numCalls = 0;

    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

        // Display the number of times fib was called
        System.out.println("fib method was called " + numCalls + " times");
    }

    /** The method for finding the Fibonacci number */
    public static long fib(long index) {
        // Increment the count each time fib is called
        numCalls++;

        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }
}

