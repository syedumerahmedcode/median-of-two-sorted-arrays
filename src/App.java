import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
         * the median of the two sorted arrays.
         * 
         * The overall run time complexity should be O(log (m+n)).
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums1 = [1,3], nums2 = [2]
         * Output: 2.00000
         * Explanation: merged array = [1,2,3] and median is 2.
         * 
         * Example 2:
         * 
         * Input: nums1 = [1,2], nums2 = [3,4]
         * Output: 2.50000
         * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
         * 
         */
        System.out.println("Hello, World!");
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        Solution solution = new Solution();
        double result = solution.findMedianInSortedArrays(nums1, nums2);
        System.out.println("Our two given sorted arrays are: " + Arrays.toString(nums1) + " and " + Arrays
                .toString(nums2) + ". The median value is: " + result);
    }
}
