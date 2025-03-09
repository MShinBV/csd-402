// Miles Shinsato, 01/19/2025, M2 Programming Assignment

import java.util.Scanner;  // Import Scanner class for reading user input
import java.util.Random;   // Import Random class for generating random numbers

public class shinsato_m2 {
    public static void main(String[] args) {
        // Array to store the choices (Rock, Paper, Scissors)
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Create a Random object for generating the computer's choice
        Random randomNumber = new Random();

        // Create a Scanner object for reading input from the user
        Scanner inputReader = new Scanner(System.in);

        // Display a welcome message to the user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Good luck and have fun!");

        // Loop for the game, allowing the user to play multiple rounds
        while (true) {
            // Print a couple of blank lines to improve readability
            System.out.println();
            System.out.println();

            // Prompt the user to choose Rock, Paper, or Scissors
            System.out.println("Please choose one of the following options: 1 for Rock, 2 for Paper, 3 for Scissors");
            System.out.println("To quit the game, enter 'q'.");

            // Print a blank line for better readability
            System.out.println();

            // Prompt the user to input their choice
            System.out.print("Please enter your choice: ");
            String userInput = inputReader.nextLine().trim();  // Read input and trim any extra spaces

            // Check if the user wants to quit the game
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Thank you for playing! Goodbye!");
                break; // Exit the loop and end the game
            }

            try {
                // Try to convert the user's input to an integer (1, 2, or 3)
                int userChoice = Integer.parseInt(userInput);

                // Validate the user's input (must be 1, 2, or 3)
                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("That is not a valid integer input!");
                    System.out.println("Please enter only 1, 2, or 3 to play or 'q' to quit.");
                } else {
                    // Generate a random number for the computer's choice (1 to 3)
                    int computerChoice = randomNumber.nextInt(3) + 1;

                    // Display both the user's and the computer's choices
                    System.out.println("You chose: " + choices[userChoice - 1]);
                    System.out.println("Computer chose: " + choices[computerChoice - 1]);

                    // Determine the outcome of the game

                    // Case 1: If the user's choice matches the computer's choice, it's a tie
                    if (userChoice == computerChoice) {
                        System.out.println("It's a draw!");

                        // Case 2: Check the winning conditions for the user
                        // Rock (1) beats Scissors (3)
                        // Paper (2) beats Rock (1)
                        // Scissors (3) beats Paper (2)
                    } else if ((userChoice == 1 && computerChoice == 3) ||
                            (userChoice == 2 && computerChoice == 1) ||
                            (userChoice == 3 && computerChoice == 2)) {

                        System.out.println("You won this round!");  // If one of the win conditions is true, the user wins
                    } else {

                        System.out.println("You lost this round!");  // If none of the win conditions are met, the user loses
                    }
                }
            } catch (NumberFormatException e) {

                // If the input is not an integer this block is executed
                System.out.println("That was an invalid input!");
                System.out.println("Please enter only numbers 1, 2, or 3 to play or 'q' to quit.");
            }
        }

        // Close the scanner object to avoid resource leaks (good practice in Java)
        inputReader.close();
    }
}
