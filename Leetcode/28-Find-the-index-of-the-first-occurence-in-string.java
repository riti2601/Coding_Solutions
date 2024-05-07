// Question 28. Find the index of the first occurrence in a string 
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        int count = -1;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        for(int i=0; i<= h.length - n.length ; i++){
            // Initialize found to true, assuming the substring matches the needle
            boolean found = true;
            // Check each character of the needle against the corresponding character in the haystack
            for(int j=0; j<n.length; j++){
                // If a character doesn't match, set found to false and break out of the loop
                if(h[i+j] != n[j]){
                found = false;
                break;
                }
            }
            // If the entire needle is found in the current substring, return the starting index of the match
            if(found){
                return i; 
            }
        }
        return count;
    }
}
