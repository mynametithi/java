import challenge.ArrayUtility;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker:");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = ispalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is palindrome.");
        } else {
            System.out.println("your array is not  palindrome");
        }
    }

    public static boolean ispalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
