package Intermediate; // Folder Reference

/* A script that utilises "Selection Sort" to order an array and,
    returns the two smallest numbers. Coded in Java. 

    Workflow: 
        1. Define and write methods in order
        2. Main method executes all required methods */

/* Array == [3 2 1 5 9 8] (6 digits)
    Therefore, input = 6 3 2 1 5 9 8 */

    import java.util.Scanner;

    public class SmallestNumbers {

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
        
        // Sort numbers
        public static void sortArray(int[] myArr, int arrSize) {
          int indexLowest;
          int i;
          int j;
          
          // Number is assigned to var i, compared to each numbers and swapped if true
          for (i = 0; i < arrSize - 1; i++) {
             indexLowest = i;

             // i is compared with j (var j refers to every other number in array)
             for (j = i+1; j < arrSize; j++) {
                if (myArr[j] < myArr[indexLowest]) {
                   indexLowest = j;
                }
             }
             
             swap(myArr, i, indexLowest); // Swap myArr[i] and myArr[indexLowest]
          }
          
          System.out.println(myArr[0] + " and " + myArr[1]); // Repeat pattern to increase number of 'lowest numbers'
       }
       
        // Exchange nums[j] and nums[k] (swapping method)
        private static void swap(int[] nums, int j, int k) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
        }

       public static void main(String[] args) {
          // Step 1: Read numbers into an array
          int[] numbers = readNums();

          // Step 2: Sort the numbers array
          sortArray(numbers, numbers.length);
       }
    }
    