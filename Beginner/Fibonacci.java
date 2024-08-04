package Beginner; // Folder Reference

/* A script that utilises the Fibonacci Sequence formula (Fn = Fn-1 + Fn-2, where n > 1),
    to locate a sequence position. Coded in Java. 

    Workflow: 
        1. Define and write required method
        2. Main method executes all required methods */

/* input 'n' will return the nth number in the sequence.
    Therefore, input: 7, output: fibonacci(7) is 13 */

import java.util.Scanner;

public class Fibonacci {
   
   public static int fibonacci(int n) {
      int a = 0;
      int b = 1;
      int c = 0;
      
      if (n >= 0) {       
        // Iterate through sequence digits
         for (int i = 2; i <= n; i++) { // i starts at 2, to calculate using full equation (i.e. 0, 1, 1, 2 (where 0 + 1 = 1))
            c = a + b;
            a = b;
            b = c;
         }

         return c;
      } else {
         return -1;  // Negative numbers are caught
      }

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
      scnr.close();
   }
}