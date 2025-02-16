// Miles Shinsato, 02/16/2025, M9 Programming Assignment (File Handling / Random Number Generate)

import java.io.*;
import java.util.Random;

public class shinsato_m9_program2 {
    public static void main(String[] args) {

        // Define the file name
        File file = new File("data.file");
        Random random = new Random();

        // Attempt to write to the file
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println("Writing 10 random numbers to data.file...");

            // Ensure new entries start on a new line
            bufferedWriter.newLine();

            // Write 10 random numbers to the file
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Random number between 0 and 99
                bufferedWriter.write(randomNumber + " ");
            }

            System.out.println("Writing complete.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Attempt to read from the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nReading from file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}