/*Write an example that counts the number of times a particular character, 
such as e, appears in a file. The character can be specified at the command 
line. You can use xanadu.txt as the input file. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCounter <character> <filename>");
            System.exit(1);
        }

        char targetChar = args[0].charAt(0);
        String filename = args[1];

        try (Scanner scanner = new Scanner(new File(filename))) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (c == targetChar) {
                        count++;
                    }
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
