// Miles Shinsato, 01/26/2025, Programming Assignment M4

import java.util.Arrays;  // Import the Arrays class to use the toString method for printing arrays

public class shinsato_m4 {

    // Method to calculate the average of a short array
    public static short average(short[] array) {

        // Variable to store the sum of elements in the array
        int sum = 0;

        // Loop through each element in the short array
        for (short num : array) {

            // Add each element to the sum
            sum += num;
        }

        // Return the average as a short, casted from the result of sum divided by the array length
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {

        // Variable to store the sum of elements in the array
        int sum = 0;

        // Loop through each element in the int array
        for (int num : array) {

            // Add each element to the sum
            sum += num;
        }

        // Return the average as an int, computed by dividing the sum by the array length
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {

        // Variable to store the sum of elements in the array
        long sum = 0;

        // Loop through each element in the long array
        for (long num : array) {

            // Add each element to the sum
            sum += num;
        }

        // Return the average as a long, computed by dividing the sum by the array length
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {

        // Variable to store the sum of elements in the array
        double sum = 0;

        // Loop through each element in the double array
        for (double num : array) {

            // Add each element to the sum
            sum += num;
        }

        // Return the average as a double, computed by dividing the sum by the array length
        return sum / array.length;
    }

    public static void main(String[] args) {

        // Test short array

        // Initialize a short array with values
        short[] shortArray = {10, 20, 30, 40};

        // Print the short array
        System.out.println("Short array: " + Arrays.toString(shortArray));

        // Calculate and print the average of the short array
        System.out.println("Average: " + average(shortArray));

        // Test int array

        // Initialize an int array with values
        int[] intArray = {15, 25, 35, 45, 55};

        // Print the int array
        System.out.println("\nInt array: " + Arrays.toString(intArray));

        // Calculate and print the average of the int array
        System.out.println("Average: " + average(intArray));

        // Test long array

        // Initialize a long array with values
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L};

        // Print the long array
        System.out.println("\nLong array: " + Arrays.toString(longArray));

        // Calculate and print the average of the long array
        System.out.println("Average: " + average(longArray));

        // Test double array

        // Initialize a double array with values
        double[] doubleArray = {12.5, 15.5, 18.5, 21.5, 24.5, 27.5, 30.5};

        // Print the double array
        System.out.println("\nDouble array: " + Arrays.toString(doubleArray));

        // Calculate and print the average of the double array
        System.out.println("Average: " + average(doubleArray));
    }
}
