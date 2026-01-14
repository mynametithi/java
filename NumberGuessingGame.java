import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=5,guess;
        System.out.println("Welcome to number gussing game:");
        do{
            System.out.println("please guess the number between 1 to 10");
            guess=input.nextInt();
        }while(num!=guess);
        System.out.println("You have successfully guess the number:");
    }
}
