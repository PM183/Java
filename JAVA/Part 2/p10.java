/* Perform following functionalities of the string:
● Find Length of the String
● Lowercase of the String
● Uppercase of the String
● Reverse String*/

public class p10 {
    public static void main(String[] args) {
        // Original String
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);

        // Find Length of the String
        int length = originalString.length();
        System.out.println("Length of the String: " + length);

        // Lowercase of the String
        String lowercase = originalString.toLowerCase();
        System.out.println("Lowercase of the String: " + lowercase);

        // Uppercase of the String
        String uppercase = originalString.toUpperCase();
        System.out.println("Uppercase of the String: " + uppercase);

        // Reverse String
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);
    }
}