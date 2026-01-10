import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Find out the answer of some basic mathematics:");
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        System.out.println("Enter the operation according(+,-,*,/)");
        String operation=input.next();
        int result=switch(operation){
            case "+"->num1+num2;
            case "-"->num1-num2;
            case "*"->num1*num2;
            case "/"->num1/num2;
            default->-1;

        };
        System.out.println("Your answer is:"+result);
    }
      
}
