import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Find the value of the given number:\n");
        System.out.println("Enter your number to find the value:\n");
        int num=input.nextInt();
        int result=num>0?num:-num;
        System.out.println("Absolute value is:"+result);

    }
}
