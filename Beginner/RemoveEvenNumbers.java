package Beginner; // Folder Reference

/* A script that reads an array and filters out 'even numbers' through 'if' statement operations,
    then returns only the odd numbers, in an array. Coded in Java. 

    Workflow: 
        1. Define and write methods in order
        2. Main method executes all required methods */

/* Array == [1, 2, 3, 4, 5, 6, 7, 8, 9] 
    Therefore, output = [1, 3, 5, 7, 9] */

import java.util.Arrays;

public class RemoveEvenNumbers {

	public static int[] removeEvens(int[] nums) {
	   int newLength = 0;
	   
       // Counts number of 'odd numbers'
	   for (int i = 0; i < nums.length; i++) {
	      if (nums[i] % 2 != 0) {
	         newLength += 1;
	      }
	   }
	   
       // Count is then turned into an array, to be populated with only 'odd numbers'
	   int[] result = new int[newLength];
	   int counter = 0; // Counter variable sets the position to insert number
	   
		for (int i = 0; i < nums.length; i++) {    // Cycles through each number of initial array
		   if (nums[i] % 2 != 0) {                 // Check for odd number

              // The digit '0' will pass the first 'if' statement, however it is even therefore, it is caught
		      if (nums[i] != 0) {
		         result[counter] = nums[i];        // Position in new array is assigned with the 'odd number' from the initial array
		         ++counter;                        // Next position
		      }
		   }
		}
	    return result;
	}

	public static void main(String[] args) {

		int [] input = {1,2,3,4,5,6,7,8,9};  // Can be replaced with Scanner obj to read array input
		int [] result = removeEvens(input);  //Parse array through RemoveEvens method

		// Helper method Arrays.toString() converts int[] to a String
		System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
	}
}

