package Beginner; // Folder Reference

/* A script that utilises the 'Random' class to choose an output (heads or tails). Coded in Java. 

    Workflow: 
        1. Define and write methods in order
        2. Main method executes all required methods */

/* Input == 3
    Therefore, output == Heads, Tails, Heads  */

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
   
   public static String coinFlip(Random rand) {
      String coin = null;
      int randomNum = rand.nextInt(2);         // Random number is 0 or 1 (bound: 2)

      if (randomNum == 1) {
         coin = "Heads";
      }
      else if (randomNum == 0) {
         coin = "Tails";
      }
      return coin;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Unique seed. 'new Random(4)' (number insertion) is used to generate a seed with a random seqeuence, 
        that can be repeated (for testing) */
      Random rand = new Random();
      
      int numTurns;
      numTurns = scnr.nextInt();
      
      // Loop to flip the coin 'numTurns' times
      for (int i = 0; i < numTurns; i++) {
         System.out.println(CoinFlip.coinFlip(rand));
      }
      scnr.close();
   }
}
