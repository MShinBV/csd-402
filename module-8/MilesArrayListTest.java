// Miles Shinsato, 02/16/2025, M8 Programming Assignment - ArrayListTest

import java.util.ArrayList;
import java.util.Scanner;

public class MilesArrayListTest {

    // Method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {

        // Check if the list is empty
        if (list.isEmpty()) {

            // Return 0 if the list is empty
            return 0;
        }

        // Initialize maxValue with the first element
        int maxValue = list.get(0);

        // Loop through the list
        for (int num : list) {

            // Compare each element with maxValue
            if (num > maxValue) {

                // Update maxValue if a larger value is found
                maxValue = num;
            }
        }

        // Return the maximum value found
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");
        while (true) {

            // Read integer input from user
            int input = scanner.nextInt();

            // Add input to the ArrayList
            numbers.add(input);

            // Stop taking input when 0 is entered
            if (input == 0) {
                break;
            }
        }

        // Call the max method to find the largest number
        Integer largest = max(numbers);

        // Print the largest number
        System.out.println("The largest number in the list is: " + largest);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
