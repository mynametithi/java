import java.util.Scanner;

public class multiplicationOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculate the multiplication value of a number:");
        System.out.println("Enter your number you want to make the table:");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"X"+i+"="+num*i);
            
        }
    }
}
