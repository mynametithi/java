import java.util.Scanner;

public class MounthOfTheYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Print the mounth of the Year:");
        System.out.println("Enter the number 1 to 12:");
        int mounth=input.nextInt();
        newSwitch(mounth);
    }
      public static void newSwitch(int mounth){
       String mounthStr=switch(mounth){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default->"invalid";
       };
       System.out.println(mounthStr);
    }
}
