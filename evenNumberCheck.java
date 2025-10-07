//Even number check using bitwise operator:

import java.util.Scanner;

public class evenNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator:");
        System.out.println("Enter your number:");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Your number is a odd number.");
        } else {
            System.out.println("Your number is a even number.");
        }
    }

}