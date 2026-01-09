import java.util.Scanner;

public class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Find the odd even checker:");
        System.out.println("Enter your number:");
        int number=input.nextInt();
        String result=number%2==0?"Even":"Odd";
        System.out.println("Your number is: "+result);
    }

}
