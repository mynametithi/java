import java.util.Scanner;

public class shorthandOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int X1 = input.nextInt();
        a += X1;
        System.out.println(a);
        int X2 = input.nextInt();
        a += X2;
        System.out.println(a);
        int X3 = input.nextInt();
        a += X3;
        System.out.println(a);
    }
}
