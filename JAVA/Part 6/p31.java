/*Write a program to show use of character and byte stream.
Also show use of BufferedReader/BufferedWriter to read console input
and write them into a file. */
import java.io.*;

public class p31 {
    public static void main(String[] args) {
        // Demonstrate character stream
        System.out.println("Character Stream Demo:");
        try (Reader reader = new FileReader("input.txt");
             Writer writer = new FileWriter("output.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("Character stream demo complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Demonstrate byte stream
        System.out.println("\nByte Stream Demo:");
        try (InputStream inputStream = new FileInputStream("input.bin");
             OutputStream outputStream = new FileOutputStream("output.bin")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Byte stream demo complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Demonstrate BufferedReader and BufferedWriter
        System.out.println("\nBufferedReader and BufferedWriter Demo:");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("console_output.txt"))) {
            System.out.print("Enter some text: ");
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
                System.out.print("Enter some text: ");
            }
            System.out.println("BufferedReader and BufferedWriter demo complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
