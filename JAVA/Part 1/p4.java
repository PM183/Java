/*Imagine you are developing a budget tracking application. You need to calculate the total expenses for the month. Users
will input their daily expenses, and the program should compute the sum of these expenses. Write a Java program to
calculate the sum of elements in an array representing daily expenses. */
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        // Initialize an array to store daily expenses
        int[] dailyExpenses = new int[30]; // assuming 30 days in a month

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter daily expenses
        System.out.println("Enter daily expenses for each day of the month:");
        for (int i = 0; i < dailyExpenses.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            dailyExpenses[i] = scanner.nextInt();
        }

        // Calculate the total expenses
        int totalExpenses = 0;
        for (int expense : dailyExpenses) {
            totalExpenses += expense;
        }

        // Display the total expenses
        System.out.println("Total expenses for the month: $" + totalExpenses);
    }
}