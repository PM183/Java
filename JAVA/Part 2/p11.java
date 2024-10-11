/*Perform following Functionalities of the string:
“CHARUSAT UNIVERSITY”
● Find length
● Replace ‘H’ by ‘FIRST LATTER OF YOUR NAME’
● Convert all character in lowercase */

public class p11 {
    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";

        // Find length
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Replace 'H' by 'FIRST LETTER OF YOUR NAME'
        // Assuming the first letter of your name is 'A'
        String replacedStr = str.replace("H", "A");
        System.out.println("Replaced string: " + replacedStr);

        // Convert all characters to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}