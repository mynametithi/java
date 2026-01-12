import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to factorial generator:");
        System.out.println("Please enter your number:");
        int number=input.nextInt();
        // long fact=factorialIterative(number);
        long fact=factorial(number);
        System.out.println("Factorial of your number is:"+fact);
    }
    public static long factorial(int number){
       if (number==1) {
          return 1;
         }
          return number*factorial(number-1);
    }
    // public static long  factorialIterative(int number) {
    //     long result=1;
    //     for(int i=1;i<=number;i++){
    //         result*=i;
    //     }
    //     return result;
    // }

}
