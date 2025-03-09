// Miles Shinsato, 03/09/2025, CSD402-A339, M12 Programming Assignment

public class shinsato_mod12_2 {
    private static final double STANDARD_SERVICE_CHARGE = 100.0;

    // Method with no parameters: Setting up the standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method with one parameter: Returns the standard service charge plus oil change fee
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // Method with two parameters: Returns the standard service charge plus oil change fee and tire rotation fee
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee;
    }

    // Method with three parameters: Returns the total cost after applying fees and discount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        double total = STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee - couponDiscount;

        // Ensures cost doesn't go negative
        return Math.max(total, 0);
    }

    public static void main(String[] args) {

        // Test each method exactly two times
        System.out.println("Test 1 (Standard Service): $" + yearlyService());
        System.out.println("Test 2 (Standard Service): $" + yearlyService());

        System.out.println("Test 3 (Standard + Oil Change): $" + yearlyService(30.0));
        System.out.println("Test 4 (Standard + Oil Change): $" + yearlyService(40.0));

        System.out.println("Test 5 (Standard + Oil Change + Tire Rotation): $" + yearlyService(30.0, 20.0));
        System.out.println("Test 6 (Standard + Oil Change + Tire Rotation): $" + yearlyService(40.0, 25.0));

        System.out.println("Test 7 (Standard + Oil Change + Tire Rotation - Coupon): $" + yearlyService(30.0, 20.0, 10.0));
        System.out.println("Test 8 (Standard + Oil Change + Tire Rotation - Coupon): $" + yearlyService(40.0, 25.0, 15.0));
    }
}
