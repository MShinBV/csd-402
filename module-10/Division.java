// Miles Shinsato, 02/23/2025, M10 Programming Assignment

// Abstract class representing a company division
abstract class Division {
    protected String name;
    protected int accountNumber;

    // Constructor to initialize division details
    public Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    // Abstract method to display division details (to be implemented by subclasses)
    public abstract void display();
}
