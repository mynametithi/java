import java.util.Scanner;

public class ternaryOperator{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to number cheaker:");
    System.out.println("Please enter your first number:");
    int num1=input.nextInt();
    System.out.println("Now, enter your second number:");
    int num2=input.nextInt();
    int greaterNumber;
if (num1>num2) {
    greaterNumber=num1;
    System.out.println(num1+ " is the greatest number.");
}
else{
    greaterNumber=num2;
    System.out.println(num2+ " is the greatest number");
}
}
}