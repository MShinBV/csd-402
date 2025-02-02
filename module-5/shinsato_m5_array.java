// Miles Shinsato, 02/01/2025, Programming Assignment M5

import java.util.Random;

public class shinsato_m5_array {

    // Find the largest element in a 2D double array and return its row and column indices
    public static int[] findDoubleLargest(double[][] array) {
        int[] location = new int[2];  // Default to (0,0)
        double largest = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                // If a larger element is found, update the location
                if (array[row][col] > largest) {
                    largest = array[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the largest element in a 2D int array and return its row and column indices
    public static int[] findSingleLargest(int[][] array) {
        int[] location = {0, 0};
        int largest = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                // Update location if a larger element is found
                if (array[row][col] > largest) {
                    largest = array[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the smallest element in a 2D double array and return its row and column indices
    public static int[] findDoubleSmallest(double[][] array) {
        int[] location = {0, 0};
        double smallest = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                // If a smaller element is found, update the location
                if (array[row][col] < smallest) {
                    smallest = array[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the smallest element in a 2D int array and return its row and column indices
    public static int[] findSingleSmallest(int[][] array) {
        int[] location = {0, 0};
        int smallest = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                // Update location if a smaller element is found
                if (array[row][col] < smallest) {
                    smallest = array[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        //Setting up how many rows and cols the array will have
        int rows = 3, cols = 3;

        // Create a random 2D double array (values between 0 and 10)
        double[][] doubleArray = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                doubleArray[i][j] = rand.nextDouble() * 10;
            }
        }

        // Create a random 2D int array (values between 0 and 9)
        int[][] intArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                intArray[i][j] = rand.nextInt(10);
            }
        }

        // Find the largest and smallest elements in both arrays
        int[] largestDouble = findDoubleLargest(doubleArray);
        int[] smallestDouble = findDoubleSmallest(doubleArray);
        int[] largestInt = findSingleLargest(intArray);
        int[] smallestInt = findSingleSmallest(intArray);

        // Get the actual largest and smallest values
        double largestDoubleValue = doubleArray[largestDouble[0]][largestDouble[1]];
        double smallestDoubleValue = doubleArray[smallestDouble[0]][smallestDouble[1]];

        int largestIntValue = intArray[largestInt[0]][largestInt[1]];
        int smallestIntValue = intArray[smallestInt[0]][smallestInt[1]];

        // Print the arrays and the results
        System.out.println("Random 2D Double Array:");
        printArray(doubleArray);
        System.out.printf("Largest value: [%d, %d] = %.2f\n", largestDouble[0], largestDouble[1], largestDoubleValue);
        System.out.printf("Smallest value: [%d, %d] = %.2f\n", smallestDouble[0], smallestDouble[1], smallestDoubleValue);

        System.out.println("\nRandom 2D Integer Array:");
        printArray(intArray);
        System.out.println("Largest value: [" + largestInt[0] + ", " + largestInt[1] + "] = " + largestIntValue);
        System.out.println("Smallest value: [" + smallestInt[0] + ", " + smallestInt[1] + "] = " + smallestIntValue);
    }

    // Helper method to print a 2D array of doubles, formatted to 2 decimal places
    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    // Helper method to print a 2D array of ints
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
