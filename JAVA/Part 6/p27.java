/*Write a program that will count the number of lines in each file that is specified 
on the command line. Assume that the files are text files. Note that multiple files 
can be specified, as in "java Line Counts file1.txt file2.txt file3.txt". Write each 
file name, along with the number of lines in that file, to standard output. If an error 
occurs while trying to read from one of the files, you should print an error message for 
that file, but you should still process all the remaining files. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p27 {
    public static void main(String[] args) {
        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}