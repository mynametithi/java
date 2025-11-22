import challenge.ArrayUtility;

public class DiagonalSum2Darray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of diagonal element of 2D Array:");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("Sum of the diagonal elements is:" + sum);
    }

    public static long sumOfDiagonal(int[][] numArr) {
        long LeftSum = sumOfLeftDiagonal(numArr);
        long RightSum = sumOfRightDiagonal(numArr);
        long sum = LeftSum + RightSum;
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }

        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }

}