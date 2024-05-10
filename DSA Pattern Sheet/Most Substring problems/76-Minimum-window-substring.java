// Question 76. Minimum Wondow Substring 
// not solved 
//SLiding window problem, substring
//Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
// The testcases will be generated such that the answer is unique.
//Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

public String minWindow(String s, String t) {
    // Initialize character frequency map for characters in string t
    int[] map = new int[128]; // Assuming ASCII characters
    
    // Populate character frequency map for string t
    for (char c : t.toCharArray()) {
        map[c]++;
    }
    
    // Initialize variables for sliding window and minimum window
    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
    
    // Start sliding window approach
    while (end < s.length()) {
        // Expand window by moving end pointer
        final char c1 = s.charAt(end);
        if (map[c1] > 0) { // If character in s exists in t, decrement counter
            counter--;
        }
        map[c1]--; // Decrement character frequency in map
        end++; // Move end pointer forward
        
        // Check if all characters from t are found in current window
        while (counter == 0) {
            // Shrink window by moving start pointer
            if (minLen > end - start) { // Update minimum window if necessary
                minLen = end - start;
                minStart = start;
            }
            final char c2 = s.charAt(start);
            map[c2]++; // Increment character frequency in map
            if (map[c2] > 0) { // If character frequency becomes positive, increment counter
                counter++;
            }
            start++; // Move start pointer forward
        }
    }
    
    // Return minimum window found in string s
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
}
