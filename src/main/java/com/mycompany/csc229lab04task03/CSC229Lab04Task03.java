/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04task03;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04Task03.git
 */
public class CSC229Lab04Task03 {
    // fib's runtime complexity is O(c^N)
    
    static int fib(int n) { // fibonacci sequence function
        
        if (n <= 0) // base case
            return 0; // Does not work on negative values or 0
        
        else if (n == 1) // base case
            return 1; // Fibonacci of 1 is 1
        
        else // non-base case
            return fib(n-1) + fib(n-2); // executes c^N times
    }
    public static void main(String[] args) {
        // Used to read user input
        Scanner scnr = new Scanner(System.in);
        int n; // Number that is fibonacci sequenced
        System.out.println("What number should I fibonacci sequence?: ");
        n = scnr.nextInt(); // Reading the user's input
        int m = fib(n); // m is the fibonacci of n
        System.out.println(m); // Printing the fibonacci of n
    }
}
