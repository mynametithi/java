import java.util.Scanner;

public class ternaryLogicOpearator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number in day wise:");
        int day=input.nextInt();
        // oldSwitch(day);
        newSwitch(day);
    }
    public static void newSwitch(int day){
       String dayStr=switch(day){
            case 1->"Sunday";
            case 2->"Monday";
            case 3->"Tuesday";
            case 4->"Wednesday";
            case 5->"Thursday";
            case 6->"Friday";
            case 7->"Saturdday";
            default ->"Invalid";
       };
       System.out.println(dayStr);
    }
    public static void oldSwitch( int day){
      switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Wrong side");
                break;
        }
    }
}
