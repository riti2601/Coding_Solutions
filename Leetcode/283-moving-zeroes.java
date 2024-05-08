// Question 283. Moving Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.


class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        // If the current element is non-zero, move it to the front of the array
        for(int k = 0; k< nums.length; k++){
            if(nums[k] != 0){
                nums[i] = nums[k];
                i++;
            }
        }
        // Fill the remaining positions with zeroes
        for(int j = i; j<nums.length; j++){
            nums[j] = 0;
        }
    }
}
