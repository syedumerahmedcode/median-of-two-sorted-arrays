
public class Solution {

    public double findMedianInSortedArrays(int[] nums1, int[] nums2) {

        /**
         * Whichever of these 2 arrays has smaller length, we keep it first.
         */
        if (nums1.length > nums2.length) {
            return findMedianInSortedArrays(nums2, nums1);
        }
        /**
         * Assign two variables x and y and assign the length of respective numbers.
         * Here x is the smaller length and y is the greater length.
         */
        int x = nums1.length;
        int y = nums2.length;

        /**
         * We also have two variables start and end
         */
        int start = 0;
        int end = x;

        while (start <= end) {
            /**
             * Calculate the x portion
             */
            int partX = (start + end) / 2;
            /**
             * Calculate the y portion
             */
            int partY = (x + y + 1) / 2 - partX;

            /**
             * Now we calculate the following:
             * - left value of x
             * - right value of x
             * - left value of y
             * - right value of y
             * 
             * NOTE: we also put MIN_VALUE and MAX_VALUE to cover cases when there is
             * nothing to traverse on x and y
             */

            int xLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX - 1];
            int xRight = partX == 0 ? Integer.MAX_VALUE : nums1[partX];
            int yLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partX - 1];
            int yRight = partY == 0 ? Integer.MAX_VALUE : nums2[partX];

            /**
             * If xLeft<=yRight and yLeft<=xRight, we have found the correctc portion. Now,
             * depending whether the total number of values are odd or even, we can simply
             * return the answer.
             * 
             * If that is not the case, we will have to update our start and end variables.
             */
            if (xLeft <= yRight && yLeft <= xRight) {
                /**
                 * IF total umber of elements in nums1 and nums2 is even, we do average
                 */
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(xLeft, yLeft) + Math.max(xRight, yRight) / 2);
                } else {
                    /**
                     * When we have odd number of elements in nums1 and nums2
                     */
                    return Math.max(xLeft, yLeft);
                }
            } else if (xLeft > yRight) {
                end = partX - 1;
            } else {
                start = partX + 1;
            }
        }
        return 0;
    }

}
