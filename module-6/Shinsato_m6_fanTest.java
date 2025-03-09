// Miles Shinsato, 02/01/2025, Programming Assignment M6

// Public class to test the Fan class
public class Shinsato_m6_fanTest {

    // Main method to execute the test program
    public static void main(String[] args) {

        // Creating an instance of Fan using the default constructor
        Fan defaultFan = new Fan();

        // Creating an instance of Fan using a parameterized constructor
        Fan customFan = new Fan(Fan.FAST, true, 8.5, "blue");

        // Print the details of the default fan and the custom fan
        System.out.println("\nDefault Fan " + defaultFan);
        System.out.println("\nCustom Fan " + customFan);

        // Modify the default fan's attributes
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setColor("red");
        defaultFan.setRadius(10.0);

        // Print the updated details of the modified default fan
        System.out.println("\nModified Fan " + defaultFan);
    }
}
