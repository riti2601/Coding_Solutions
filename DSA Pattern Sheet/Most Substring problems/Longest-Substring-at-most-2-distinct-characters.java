//Longest Substring - at most 2 distinct characters
//sliding window

public int lengthOfLongestSubstringTwoDistinct(String s) {
    // Initialize character frequency map
    int[] map = new int[128]; // Assuming ASCII characters
    
    // Initialize variables for sliding window and maximum length
    int start = 0, end = 0, maxLen = 0, counter = 0;

    // Start sliding window approach
    while (end < s.length()) {
        // Expand window by moving end pointer
        final char c1 = s.charAt(end);
        if (map[c1] == 0) // If character is encountered for the first time in current window, increment counter
            counter++;
        map[c1]++; // Increment character frequency in map
        end++; // Move end pointer forward

        // Shrink window if number of distinct characters exceeds 2
        while (counter > 2) {
            final char c2 = s.charAt(start);
            if (map[c2] == 1) // If character frequency becomes 1 after decrementing, decrement counter
                counter--;
            map[c2]--; // Decrement character frequency in map
            start++; // Move start pointer forward
        }

        // Update maximum length of substring with at most 2 distinct characters
        maxLen = Math.max(maxLen, end - start);
    }

    // Return maximum length of substring with at most 2 distinct characters
    return maxLen;
}
