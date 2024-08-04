package Intermediate; // Folder Reference

/* A script that utilises "Insertion Sort" to order an array. 
    Steps are shown in the output for educational purposes. Coded in Java. 

    Workflow: 
        1. Define and write methods in order
        2. Main method executes all required methods */

/* Array == [3 2 1 5 9 8] (6 digits)
    Therefore, input = 6 3 2 1 5 9 8 */

import java.util.Scanner;

public class InsertionSort {
   public static int totalSwaps = 0;
   public static int totalComp = 0;
  
   // First int is read (number of integers that follow)
   private static int[] readNums() {
      Scanner scnr = new Scanner(System.in);    // Initialise Scanner obj
      int size = scnr.nextInt();                // Read array size
      int[] numbers = new int[size];            // Create array

      // Read the numbers, insert in array
      for (int i = 0; i < size; ++i) {
         numbers[i] = scnr.nextInt();
      }
      
      scnr.close();
      return numbers;
   }

   // Initial print of the numbers in the array, separated by spaces
   private static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.print(nums[i]);
         if (i < nums.length - 1) {
            System.out.print(" ");
         }
      }
      System.out.println();
   }

   // Exchange nums[j] and nums[k] (swapping method)
   private static void swap(int[] nums, int j, int k) {
      int temp = nums[j];
      nums[j] = nums[k];
      nums[k] = temp;
      ++totalSwaps;
   }
   
   public static int getTotalSwaps() {
      return totalSwaps;
   }
   
   public static int getTotalComp() {
      return totalComp;
   }

   // Sort numbers. Count comparisons and swaps. Output the array at the end of each iteration
   public static void insertionSort(int[] numbers) {
      int i;
      int j;

      for (i = 1; i < numbers.length; ++i) {
         j = i;
         
         // Insert numbers[i] into sorted part, stopping once numbers[i] is in correct position
         while (j > 0 && totalComp++ >= 0 && numbers[j] < numbers[j - 1]) {
            swap(numbers, j, j - 1);    // Swap numbers[j] and numbers[j - 1]
            --j;
         }
         
         printNums(numbers);
      }
   }

   public static void main(String[] args) {
      // Step 1: Read numbers into an array
      int[] numbers = readNums();

      // Step 2: Output the numbers array
      printNums(numbers);
      System.out.println();

      // Step 3: Sort the numbers array
      insertionSort(numbers);
      System.out.println();

      // Step 4: Output the number of comparisons and swaps performed
      System.out.println("comparisons: " + getTotalComp());
      System.out.println("swaps: " + getTotalSwaps());
   }
}