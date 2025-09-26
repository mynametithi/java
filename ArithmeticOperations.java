
//create a program that takes two numbers and shows result of all arithmatic operations:
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Perform arithmetic operations
        System.out.println("\nResults of Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        // Division and Modulus (check for divide by zero)
        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division: Not possible (division by zero)");
            System.out.println("Modulus: Not possible (division by zero)");
        }
        sc.close();
    }
}
