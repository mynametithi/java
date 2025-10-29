import java.util.Scanner;

import challenge.ArrayUtility;

public class ArrayOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurance:");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now what is the number you want to find?");
        int num = input.nextInt();
        int Occurances = noOfOccurances(numArr, num);
        System.out.println("Your element was found in time " + Occurances + " in the Array");
    }

    public static int noOfOccurances(int[] numArray, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
