import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise OR operator");
        System.out.println("Enter first number:");
        int first = input.nextInt();
        int result = first << 4;
        System.out.println("result is:" + result);
    }
}
