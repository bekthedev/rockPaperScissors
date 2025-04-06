package edu.bekthedev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

     do{
           // GET CHOICE FROM THE USER
           System.out.println("Enter your move: (rock, paper, scissors): ");
           playerChoice = scanner.nextLine().trim().toLowerCase();
   
           if (!playerChoice.matches("rock|paper|scissors")) {
               System.out.println("Invalid choice!!");
               continue;
   
           }
   
           // GET RANDOM CHOICE FROM THE COMPUTER
           computerChoice = choices[random.nextInt(3)];
           System.out.println("Computer choice: " + computerChoice);
           // GET WIN CONDITIONS
   
          String results = switch (playerChoice + "-" + computerChoice) {
               case "rock-rock", "paper-paper", "scissors-scissors" -> "It's a tie!";
               case "rock-scissors", "paper-rock", "scissors-paper" -> "You win!";
               case "rock-paper", "paper-scissors", "scissors-rock" -> "Computer wins!";
               default -> "Unexpected result.";
           };
   
           System.out.println(results);
           // ASK TO PLAY AGAIN?
           System.out.println("Do you want to play again? (yes/no): ");
           playAgain = scanner.nextLine().trim().toLowerCase();
     }while(playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("Have a good day!");
        
        scanner.close();
    }
}