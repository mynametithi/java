import java.util.Scanner;

public class arrayUtility {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
          System.out.println("Please enterv the number of elements");
        int size=input.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.println("Please enter the element no"+()+" :");
            nums[i]=input.nextInt();
            i++;
        }
    }
}
