package edu.bekthedev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // ROCK PAPER SCISSORS

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        //GET CHOICE FROM THE USER
        System.out.println("Enter your move: (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice!!");
        }
        //GET RANDOM CHOICE FROM THE COMPUTER
        //GET WIN CONDITIONS
        //ASK TO PLAY AGAIN?
        //GOODBYE MESSAGE

        scanner.close();
    }
}