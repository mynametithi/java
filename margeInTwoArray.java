import challenge.ArrayUtility;

public class margeInTwoArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted Arrays:");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] margedArr = merge(arr1, arr2);
        System.out.println("Your merge array is:");
        ArrayUtility.displayArray(margedArr);
        System.out.println("Your merged array is:");
        ArrayUtility.displayArray(margedArr);

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
    }
}
