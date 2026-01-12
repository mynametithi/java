import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Check the password is right or wrong:");
        boolean password;
        do{
            System.out.println("Enter your password:");
         password=input.nextInt();
        }while(!isValidPassword(password));
        System.out.println("Thank you for giving the valid password:");

    }
    public static boolean isValidPassword(String password){
return password.length()>6;
    }
}
