/*Write a java program which takes two integers x & y as input, you have to compute x/y. 
If x and y are not integers or if y is zero, exception will occur and you have to report it. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the dividend (x): ");
            int x = scanner.nextInt();

            System.out.println("Enter the divisor (y): ");
            int y = scanner.nextInt();

            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            double result = (double) x / y;
            System.out.println("The result of x/y is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}