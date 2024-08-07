package Beginner;

import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args){
        
        double inputVal1;
        double inputVal2;
        double inputVal3;
        
        boolean Val1PerfectSquare;
        boolean Val2PerfectSquare;
        boolean Val3PerfectSquare;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please input your first decimal value:");
        inputVal1 = scnr.nextDouble();
        double sqrtInputVal1 = Math.sqrt(inputVal1);

        if (sqrtInputVal1 % 1 == 0){
           Val1PerfectSquare = true;
        }
        else {
           Val1PerfectSquare = false;
        }
        
        
        double sqrtInputVal1Rounded = (int)sqrtInputVal1;
        int sqrtInputVal1Int = (int)sqrtInputVal1Rounded;
       
        
        System.out.println("Please input your second decimal value:");
        inputVal2 = scnr.nextDouble();
        double sqrtInputVal2 = Math.sqrt(inputVal2);

        if (sqrtInputVal2 % 1 == 0){
           Val2PerfectSquare = true;
        }
        else {
           Val2PerfectSquare = false;
        }
        
        
        double sqrtInputVal2Rounded = (int)sqrtInputVal2;
        int sqrtInputVal2Int = (int)sqrtInputVal2Rounded;
        
        System.out.println("Please input your third decimal value:");
        inputVal3 = scnr.nextDouble();
        
        double sqrtInputVal3 = Math.sqrt(inputVal3);

        if (sqrtInputVal3 % 1 == 0){
           Val3PerfectSquare = true;
        }
        else {
           Val3PerfectSquare = false;
        }
        
        
        double sqrtInputVal3Rounded = (int)sqrtInputVal3;
        int sqrtInputVal3Int = (int)sqrtInputVal3Rounded;
        
        System.out.println();
        
        System.out.printf("%-10s%-30s%-20s\n", "Input", "Square Root as Integer", "Perfect Square");
        System.out.printf("%-10.2f%-30d%-20s\n", inputVal1, sqrtInputVal1Int, Val1PerfectSquare);
        System.out.printf("%-10.2f%-30d%-20s\n", inputVal2, sqrtInputVal2Int, Val2PerfectSquare);
        System.out.printf("%-10.2f%-30d%-20s\n", inputVal3, sqrtInputVal3Int, Val3PerfectSquare);
        //System.out.println(sqrtInputVal1Int);
    }
}