import java.util.Scanner;

public class arraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 5, 6, 67, 23, 89 };
        System.out.println("Welcome to array searching:");
        System.out.println("Enter the number you want to search");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in array");
        } else {
            System.out.println("Your number was not found in array");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
