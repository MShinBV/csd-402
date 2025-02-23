// Miles Shinsato, 02/23/2025, M10 Programming Assignment

// Main application to demonstrate Division functionality
public class UseDivision {
    public static void main(String[] args) {
        // Create international divisions
        InternationalDivision europeDivision = new InternationalDivision("European Operations", 1001, "Germany", "German");
        InternationalDivision asiaDivision = new InternationalDivision("Asia-Pacific", 1002, "Japan", "Japanese");

        // Create domestic divisions
        DomesticDivision eastDivision = new DomesticDivision("East Coast HQ", 2001, "New York");
        DomesticDivision westDivision = new DomesticDivision("West Coast HQ", 2002, "California");

        // Display division details
        europeDivision.display();
        asiaDivision.display();
        eastDivision.display();
        westDivision.display();
    }
}
