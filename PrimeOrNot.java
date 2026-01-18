import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Given number is prime or not this cheacker");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        // boolean isPrime= isPrime(int num);
        System.out.println("Your number is "+(isPrime(num)?"prime number":"not Prime number"));
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
}
