/*Print the sum, difference and product of two Complex_p16 numbers by creating a class 
named ‘Complex_p16’ with separate methods for each operation whose real and imaginary parts
are entered by user. */

import java.util.Scanner;

class Complex_p16 {
    double real;
    double imaginary;

    // Constructor to initialize the Complex_p16 number
    Complex_p16(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two Complex_p16 numbers
    Complex_p16 add(Complex_p16 other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex_p16(realPart, imaginaryPart);
    }

    // Method to subtract two Complex_p16 numbers
    Complex_p16 subtract(Complex_p16 other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex_p16(realPart, imaginaryPart);
    }

    // Method to multiply two Complex_p16 numbers
    Complex_p16 multiply(Complex_p16 other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex_p16(realPart, imaginaryPart);
    }

    // Method to print the Complex_p16 number
    void print() {
        System.out.print(this.real);
        if (this.imaginary >= 0) {
            System.out.print(" + ");
        } else {
            System.out.print(" - ");
        }
        System.out.print(Math.abs(this.imaginary));
        System.out.print("i");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real and imaginary parts of the first Complex_p16 number: ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex_p16 num1 = new Complex_p16(real1, imaginary1);

        System.out.print("Enter the real and imaginary parts of the second Complex_p16 number: ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex_p16 num2 = new Complex_p16(real2, imaginary2);

        Complex_p16 sum = num1.add(num2);
        Complex_p16 difference = num1.subtract(num2);
        Complex_p16 product = num1.multiply(num2);

        System.out.println("The sum of the two Complex_p16 numbers is:");
        sum.print();

        System.out.println("The difference of the two Complex_p16 numbers is:");
        difference.print();

        System.out.println("The product of the two Complex_p16 numbers is:");
        product.print();
    }
}
