/*Write a Java program that throws an exception and catch it using a try-catch block. */

public class p25 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int num = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Error: " + e.getMessage());
        }
    }
}