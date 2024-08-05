package Intermediate; // Folder Reference

/* A script that utilises The 'String Tokeniser' class to break a string into tokens, 
    i.e. an array of individual characters. Coded in Java. */

/* Input must be 5 characters in length, output is described through code comments */

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        String secretWord = "enjoy";                             // The word to be guessed, can be changed
        String[] secretTokenised = secretWord.split("");   // Tokenise the secret word
        
        System.out.println("Please enter your first attempt.");
        String answer = scnr.nextLine();
        String[] answerTokenised = answer.split("");       // Tokenise the user input (answer)
        
        int counter = 0;  // Counter for number of attempts
        
        // While the answer is incorrect and the number of attempts (counter) is less than 5
        while (!answer.equals(secretWord) && counter < 5) {     
           int diff = 0;
           counter++;
           System.out.println(answer);
           
           // For each character in the answer (user input)
           for (int i = 0; i < answerTokenised.length; i++) {
              int j = i;

              // Prints "X" 'if' the secret word does not contain the character
              if (!secretWord.contains(answerTokenised[i])) {
                 System.out.print("X");
              }
              // Prints the character if it is in the correct position
              else if (secretTokenised[i].equals(answerTokenised[i]) && i == j) {
                 System.out.print(answerTokenised[i]);
              }
              // Prints the character in parentheses if it is in the secret word but not in the correct position
              else {
                 System.out.print("(" + answerTokenised[i] + ")");
                 
                 String answerLetter = answerTokenised[i];
                 String secretLetter = secretTokenised[i];
                 
                 /* Lexicographical distance between letter and the correct letter position in the secret word.
                    If an incorrect letter 'n' is guessed, and the letter should've been 'j' or 'r', the distance is 4.
                    Seen here: (j k l m <- n -> o p q r). The absolute value is taken to ensure the distance is positive */
                 diff = Math.abs(answerLetter.compareTo(secretLetter)); 
              }
           } 
           
           // If a difference is calculated, print the difference
           if (diff > 0) {
              System.out.print("\nOne of your letters is " + diff + " characters away");
           }
           // If the answer is incorrect, prompt the user to try again
           System.out.println("\n\nPlease try again: ");
           answer = scnr.nextLine();
           answerTokenised = answer.split("");
        } 
        
        // If the answer is correct, print the answer and a congratulatory message
        if (answer.equals(secretWord)) {
           System.out.print(answer);
           System.out.print("\nCongratulations, you found the word.");
        }
        // If the answer is incorrect after 5 attempts, print a message
        else {
           System.out.print("\nBetter luck next time");
        }
        scnr.close();
    }
}
