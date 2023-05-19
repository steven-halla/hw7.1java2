// Steven Halla
// HW 7.1
// CS 142

import java.util.Scanner;

/*******************************************************************
 * Fibonacci: calculates the fib number at a specific index. This class also
 *              tracks how many times we loop.
 *
 * @author Steven Halla
 * @version 1.0
 * @since 19 may 2023
 **/
public class Fibonacci {
    // Add a static variable to keep track of the number of calls
    public static long loopNumber = 0;

    /*******************************************************************
     * main: ask for user input for fib number.
     *
     * @param args String[]
     * @author Steven Halla
     * @version 1.0
     * @since 19 may 2023
     **/
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

        System.out.println("fib method was called " + loopNumber + " times");
    }

    /*******************************************************************
     * fib: handles how many times we loop
     *
     * @param   index
     * @return  fibonnci number at its index
     * @author Steven Halla
     * @version 1.0
     * @since 19 may 2023
     **/

    public static long fib(long index) {
        // Increment the count each time fib is called
        loopNumber++;

        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}

