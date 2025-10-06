import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise complement");
        System.out.println("Enter your number:");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("The complement of the number:" + result);
    }
}
