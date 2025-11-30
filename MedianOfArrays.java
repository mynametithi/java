import java.util.*;

public class MedianOfArrays {

    public static void main(String[] args) {

        // You can give custom input or keep these example inputs
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};

        // Call the method
        double median = findMedianSortedArrays(nums1, nums2);

        // Output
        System.out.println("Median is: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge both sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Find median
        int total = m + n;

        if (total % 2 == 1) {
            // odd length → middle element
            return merged[total / 2];
        } else {
            // even length → average of two middle elements
            return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0;
        }
    }
}

