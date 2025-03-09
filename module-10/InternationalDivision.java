// Miles Shinsato, 02/23/2025, M10 Programming Assignment

// Represents a division located outside the country
class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor to initialize international division details
    public InternationalDivision(String name, int accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Display method implementation for international divisions
    @Override
    public void display() {
        System.out.println("International Division: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Located in: " + country);
        System.out.println("Primary Language: " + language);
        System.out.println("------------------------------");
    }
}
