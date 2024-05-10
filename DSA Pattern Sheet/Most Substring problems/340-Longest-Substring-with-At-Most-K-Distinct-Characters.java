//340. Longest Substring with At Most K Distinct Characters
//not solved - premium 
// sliding window

// Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
// Example 1:
// Input: s = "eceba", k = 2
// Output: 3
// Explanation: The substring is "ece" with length 3.

public int lengthOfLongestSubstringKDistinct(String s, int k) {
    // Initialize character frequency map
    int[] map = new int[256]; // Assuming ASCII characters
    
    // Initialize variables for sliding window and maximum length
    int start = 0, end = 0, maxLen = Integer.MIN_VALUE, counter = 0;

    // Start sliding window approach
    while (end < s.length()) {
        // Expand window by moving end pointer
        final char c1 = s.charAt(end);
        if (map[c1] == 0) // If character is encountered for the first time in current window, increment counter
            counter++;
        map[c1]++; // Increment character frequency in map
        end++; // Move end pointer forward

        // Shrink window if number of distinct characters exceeds k
        while (counter > k) {
            final char c2 = s.charAt(start);
            if (map[c2] == 1) // If character frequency becomes 1 after decrementing, decrement counter
                counter--;
            map[c2]--; // Decrement character frequency in map
            start++; // Move start pointer forward
        }

        // Update maximum length of substring with at most k distinct characters
        maxLen = Math.max(maxLen, end - start);
    }

    // Return maximum length of substring with at most k distinct characters
    return maxLen;
}
