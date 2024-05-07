// Question - 3131. Find the integer added to array I
// You are given two arrays of equal length, nums1 and nums2. Each element in nums1 has been increased (or decreased in the case of negative) by an integer, represented by the variable x. As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.
// Return the integer x.

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Calculate the difference between the first elements of nums1 and nums2
        int x = nums2[0] - nums1[0];

        // Iterate through the arrays to check if the difference remains consistent
        for( int i=1; i< nums1.length; i++){
            if (nums2[i] - nums1[i] != x) {
                return -1;
            }
        }
        return x;
    }
}
