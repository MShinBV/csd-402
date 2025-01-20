// Miles Shinsato, 01/19/2025, M3 Programming Assignment CSD-402 A339

public class shinsato_m3{

    // method used to determine spacing based on the numbers found in the line
    public static String spaces(int num) {
        if (num < 10) {
            return "  "; // Two spaces for single-digit numbers
        } else {
            return " "; // One space for two-digit numbers
        }
    }

    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pyramid

        // Outer loop for the number of rows (height of the pyramid)
        for (int cols = 1; cols <= rows; cols++) {

            // Print leading spaces for proper alignment of numbers
            for (int i = cols; i < rows; i++) {
                System.out.print("   ");
            }

            // Print increasing powers of 2
            int number = 1;
            for (int i = 1; i <= cols; i++) {
                System.out.print(number + spaces(number));
                number *= 2; // Increase the power of 2 for the next number
            }

            // Print decreasing powers of 2
            number /= 2; // Adjust to start printing the correct decreasing powers
            for (int i = 1; i < cols; i++) {
                number /= 2; // Decrease the power of 2 for the next number
                System.out.print(number + spaces(number));
            }

            // Print trailing spaces for alignment before printing "@"
            for (int i = cols; i < rows; i++) {
                System.out.print("   ");
            }

            // Print "@" at the end of each row
            System.out.print("@");

            // Move to the next line after each row
            System.out.println();
        }
    }
}
