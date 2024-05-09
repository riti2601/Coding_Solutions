//Question 66. Plus One
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate through the digits array in reverse order
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the updated array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }
        
        // If we reach this point, it means all digits were 9, so we need to add a new leading digit
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the leading digit to 1
        return newDigits;
    }
}
