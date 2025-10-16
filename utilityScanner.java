import java.util.Scanner;

public class utilityScanner {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array of sum and average");
        System.out.println("Please enter the number of elements");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while(i<size){
            System.out.println("please Enter element no: "+(i+1));
            i++;
    }
}
