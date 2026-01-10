import java.util.Scanner;

public class studentCategories {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Student Categories according to marks obtain:");
System.out.println("Please enter your marks:");
int marks=input.nextInt();
String category=marks>90?"High":(marks>50?"Moderate":"Low");
System.out.println("Your category is: "+category);
    }
}
