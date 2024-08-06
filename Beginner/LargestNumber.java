package Beginner; // Folder Reference

// A script to find the largest number in each array, coded in Java

import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) throws Exception {

        // int arrays are declared and assigned values
        int[] intArray1 = {70, 61, 72, 83, 38};
        int[] intArray2 = {7, 2, 76, 4, 99};
        int[] intArray3 = {28, 9, 13, 78, 19};
        int[] intArray4 = {68, 84, 41, 62, 18};

        ArrayList<int[]> intArrayList = new ArrayList<int[]>();

        // int arrays are added to the ArrayList (for interation purposes)
        intArrayList.add(intArray1);
        intArrayList.add(intArray2);
        intArrayList.add(intArray3);
        intArrayList.add(intArray4);

        for (int[] i : intArrayList){
            FindMax(i);
        }
    }

    public static void FindMax(int intArray[]) {
        int maxNum = 0;

        // Largest number is assigned to maxNum
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxNum) {
                maxNum = intArray[i];
            }
        }

        System.out.println(maxNum);
    }
}
