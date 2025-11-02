import challenge.ArrayUtility;

public class isSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting checking post:");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isDec || isInc) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArr) {
        return false;
    }

    public static boolean isIncreasing(int[] numArr) {
        int i=1;
        while(i<numArr.length){
            if(numArr[i]>=numArr[i-1]){
                i++;
            }

        }
        return false;
    }
}
