// Miles Shinsato, 02/23/2025, M10 Programming Assignment

// Represents a division located within the country
class DomesticDivision extends Division {
    private String state;

    // Constructor to initialize domestic division details
    public DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    // Display method implementation for domestic divisions
    @Override
    public void display() {
        System.out.println("Domestic Division: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Operating in: " + state);
        System.out.println("------------------------------");
    }
}
