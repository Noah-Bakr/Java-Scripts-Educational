package Beginner; // Folder Reference

/* A script that utilises 'if' statements to decide if an enetered year was/is a leap year. Coded in Java. */

/* Input == 1976
    Therefore, output == 'The year 1976 is a leap year'  */

import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();

      scnr.close();

      // If the year is divisible by 4, then it is a potentially leap year
      if (inputYear % 4 == 0) {
            isLeapYear = true;
 
            // To identify whether it is a century year or not (divisible by 100)
            if (inputYear % 100 == 0) {

                // If a century year is divisible by 400, then it is a leap year
                if (inputYear % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        }
      
        // Output the result
        // "isLeapYear" is a boolean, (variable ? true : false)
        System.out.println("The year " + inputYear + (isLeapYear ? " is a leap year" : " is not a leap year"));
   }
}
