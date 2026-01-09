import java.util.Scanner;

public class minimumValue {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Find the minimum value of two number:");
    System.out.println("Enter your first number");
    int num1=input.nextInt();
    System.out.println("Enter your second number");
    int num2=input.nextInt();
    minimumValue minimum=new minimumValue();
    int min=minimum.min(num1,num2);
    System.out.println("minimum value of two number:"+min);
}
public int min(int num1,int num2){
return num1<num2?num1:num2;
    }
    
}