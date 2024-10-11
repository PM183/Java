/*Create a Java program that prompts the user to enter the number of days (n) for which they 
want to generate their exercise routine. The program should then calculate anddisplay the first 
n terms of the Fibonacci series, representing the exercise duration for each day. */
import java.util.Scanner;

public class p6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of days (n) for your exercise routine: ");
    int n = scanner.nextInt();

    int[] fibonacciSeries = new int[n];
    fibonacciSeries[0] = 1;
    fibonacciSeries[1] = 1;

    for (int i = 2; i < n; i++) {
      fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
    }

    System.out.println("Your exercise routine for the next " + n + " days is:");
    for (int i = 0; i < n; i++) {
      System.out.println("Day " + (i+1) + ": " + fibonacciSeries[i] + " minutes");
    }
  }
}