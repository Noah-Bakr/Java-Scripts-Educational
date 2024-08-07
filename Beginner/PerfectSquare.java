package Beginner; // Folder Reference

/* A script that accepts 3 decimal values and checks 'if' they are a 'perfect square',
    then returns the SQRT and boolean. Coded in Java. 

    Workflow: 
        1. Define and write 'check' method
        2. Main method accepts input then manipulates in 'print' statement  */

/* Input of 16 should output:
 *    Input       Square Root as Integer      Perfect Square
 *    16.00       4                           true
 */

import java.util.Scanner;
public class PerfectSquare{

   // Method to check if a number is a perfect square
   public static boolean isPerfectSquare(double x) {
      // If the remainder of the number is 0, then it is a perfect square and, true is returned
      return (x % 1 == 0);
   }

    public static void main(String[] args) {
        double value1;
        double value2;
        double value3;

        Scanner scnr = new Scanner(System.in); // Scanner object to read input
        
        // Read the 3 decimal values
        System.out.print("Please input your first decimal value: ");
        value1 = scnr.nextDouble();

        System.out.print("Please input your second decimal value: ");
        value2 = scnr.nextDouble();
        
        System.out.print("Please input your third decimal value: ");
        value3 = scnr.nextDouble();
        
        scnr.close(); // Close scanner

        System.out.println();
        
        System.out.printf("%-10s%-30s%-20s\n", "Input", "Square Root as Integer", "Perfect Square");
        // Print the values and their respective SQRT and boolean
        System.out.printf("%-10.2f%-30d%-20s\n", value1, (int)Math.sqrt(value1), isPerfectSquare(Math.sqrt(value1)));
        System.out.printf("%-10.2f%-30d%-20s\n", value2, (int)Math.sqrt(value2), isPerfectSquare(Math.sqrt(value2)));
        System.out.printf("%-10.2f%-30d%-20s\n", value3, (int)Math.sqrt(value3), isPerfectSquare(Math.sqrt(value3)));
        
    }
}
