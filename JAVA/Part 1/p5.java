/*An electric appliance shop assigns code 1 to motor,2 to fan,3 to tube and 4 for wires. All other items have code 5 or
more. While selling the goods, a sales tax of 8% to motor,12% to fan,5% to tube light,7.5% to wires and 3%
for all other items is charged. A list containing the product ncode and price in two different arrays. Write a java
program using switch statement to prepare the bill. */
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        // Initialize arrays to store product codes and prices
        int[] productCodes = {1, 2, 3, 4, 5, 6}; // example data
        double[] prices = {1000.0, 500.0, 200.0, 150.0, 800.0, 1200.0}; // example data

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the bill
        System.out.println("Electric Appliance Shop Bill");
        System.out.println("----------------------------");
        for (int i = 0; i < productCodes.length; i++) {
            int code = productCodes[i];
            double price = prices[i];

            // Calculate the sales tax using a switch statement
            double taxRate = 0.0;
            switch (code) {
                case 1:
                    taxRate = 0.08;
                    break;
                case 2:
                    taxRate = 0.12;
                    break;
                case 3:
                    taxRate = 0.05;
                    break;
                case 4:
                    taxRate = 0.075;
                    break;
                default:
                    taxRate = 0.03;
            }

            // Calculate the total amount
            double taxAmount = price * taxRate;
            double totalAmount = price + taxAmount;

            // Display the bill details
            System.out.println("Product Code: " + code);
            System.out.println("Price: $" + price);
            System.out.println("Tax Rate: " + taxRate * 100 + "%");
            System.out.println("Tax Amount: $" + taxAmount);
            System.out.println("Total Amount: $" + totalAmount);
            System.out.println();
        }

        // Display the total bill amount
        double totalBillAmount = 0.0;
        for (double price : prices) {
            totalBillAmount += price;
        }
        System.out.println("Total Bill Amount: $" + totalBillAmount);
    }
}


