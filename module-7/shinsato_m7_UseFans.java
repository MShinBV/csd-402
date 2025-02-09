// Miles Shinsato, 02/09/2025, Programming Assignment M7 (Using Programming Assignment M6)


import java.util.ArrayList;

public class shinsato_m7_UseFans {

    // Method to display a collection of fans without using toString()
    // This method iterates over an ArrayList of Fan objects that display each fan's details
    public void displayFans(ArrayList<shinsato_m7_Fan> fans) {
        for (shinsato_m7_Fan fan : fans) {


            // Displaying fan details manually
            // Print fan status, speed, color, and radius
            System.out.println("Fan status: " + (fan.isfanStateOn() ? "On" : "Off"));
            System.out.println("Fan speed: " + (fan.getSpeed() == shinsato_m7_Fan.SLOW ? "Slow" :
                    fan.getSpeed() == shinsato_m7_Fan.MEDIUM ? "Medium" :
                            fan.getSpeed() == shinsato_m7_Fan.FAST ? "Fast" : "Stopped"));
            System.out.println("Color: " + fan.getColor());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println();
        }
    }

    // Method to display a single fan's details without using toString()
    // This method will show the fan's state, speed, color, and radius
    public void displaySingleFan(shinsato_m7_Fan fan) {

        // Displaying fan details manually
        System.out.println("Fan status: " + (fan.isfanStateOn() ? "On" : "Off"));
        System.out.println("Fan speed: " + (fan.getSpeed() == shinsato_m7_Fan.SLOW ? "Slow" :
                fan.getSpeed() == shinsato_m7_Fan.MEDIUM ? "Medium" :
                        fan.getSpeed() == shinsato_m7_Fan.FAST ? "Fast" : "Stopped"));
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {

        // Create instances of Fan
        shinsato_m7_Fan defaultFan = new shinsato_m7_Fan();  // Using default constructor
        shinsato_m7_Fan customFan = new shinsato_m7_Fan(shinsato_m7_Fan.FAST, true, 8.5, "blue");  // Using parameterized constructor

        // Create a collection of Fan instances
        ArrayList<shinsato_m7_Fan> fanCollection = new ArrayList<>();
        fanCollection.add(defaultFan);
        fanCollection.add(customFan);

        // Create an instance of UseFans and display all the fans in the collection
        shinsato_m7_UseFans useFans = new shinsato_m7_UseFans();
        System.out.println("Displaying all fans:");
        useFans.displayFans(fanCollection);

        // Display a single fan's details
        System.out.println("Displaying a single fan:");
        useFans.displaySingleFan(customFan);
    }
}
