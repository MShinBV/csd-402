// Miles Shinsato, 01/12/2025, CSD-402 A339, M1 Programming Assignment
// This program is to calculate energy needed to heat water from an initial temperature to a final temperature


import java.util.Scanner;

public class Shinsato_M1_Programming_Assignment {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user for the initial temperature
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        // Prompt the user for the final temperature
        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);

        // Close the scanner
        scanner.close();
    }
}
