// Miles Shinsato, 02/16/2025, M9 Programming Assignment - Program 1 (ArrayList)

import java.util.ArrayList;
import java.util.Scanner;

public class shinsato_m9_program1 {
    public static void main(String[] args) {

        // ArrayList of Straw Hat Crew Members, technically Vivi doesn't count but she sort of does.
        ArrayList<String> list = new ArrayList<>();
        list.add("Monkey D. Luffy");
        list.add("Roronoa Zoro");
        list.add("Nami");
        list.add("Usopp");
        list.add("Sanji");
        list.add("Tony Tony Chopper");
        list.add("Nefertari Vivi");
        list.add("Nico Robin");
        list.add("Franky");
        list.add("Brook");
        list.add("Jinbe");

        // Print all elements using a for-each loop
        System.out.println("List of Straw Hat Crew Members:");
        for (String crew : list) {
            System.out.println(crew);
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Flag to control the loop
        boolean keepGoing = true;

        // Loop to allow the user to enter multiple indexes
        while (keepGoing) {

            // Prompt the user to input an index to view a specific element
            System.out.print("\nEnter the index (0 - 10) of the crew member you want to see again\n(0 = Monkey D. Luffy, 10 = Jinbe), or -1 to exit: ");

            // Read the user input for the index
            int index = scanner.nextInt();

            // Check if the user wants to exit
            if (index == -1) {
                System.out.println("Exiting the program. Goodbye!");

                // Exit the loop
                keepGoing = false;

            } else {

                // Try to print the element at the provided index
                try {
                    String element = list.get(index);

                    // Display the element at the index
                    System.out.println("Element at index " + index + ": " + element);
                } catch (IndexOutOfBoundsException e) {

                    // Catch the exception if the index is out of bounds
                    System.out.println("Exception: Out of Bounds. \nPlease enter a valid index (0-10).");
                }
            }
        }
        // Close scanner
        scanner.close();
    }
}
