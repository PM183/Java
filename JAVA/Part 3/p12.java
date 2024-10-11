/* Imagine you are developing a currency conversion tool for a travel agency. This tool should be able to convert an amount
in Pounds to Rupees. For simplicity, we assume the conversion rate is fixed: 1 Pound = 100 Rupees. The tool
should be able to take input both from command-line arguments and interactively from the user.*/

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        // Define the conversion rate
        double conversionRate = 100.0; // 1 Pound = 100 Rupees

        // Check if command-line argument is provided
        if (args.length > 0) {
            // Convert command-line argument to double
            double pounds = Double.parseDouble(args[0]);
            double rupees = convertPoundsToRupees(pounds, conversionRate);
            System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
        } else {
            // Take input interactively from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an amount in Pounds: ");
            double pounds = scanner.nextDouble();
            double rupees = convertPoundsToRupees(pounds, conversionRate);
            System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
        }
    }

    // Method to convert Pounds to Rupees
    public static double convertPoundsToRupees(double pounds, double conversionRate) {
        return pounds * conversionRate;
    }
}
