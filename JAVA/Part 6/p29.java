/*Write a Java Program to Search for a given word in a
File. Also show use of Wrapper Class with an example. */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java WordSearch <word> <filename>");
            System.exit(1);
        }

        String targetWord = args[0];
        String filename = args[1];

        try (Scanner scanner = new Scanner(new File(filename))) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
