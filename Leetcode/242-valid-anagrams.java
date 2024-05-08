// Question 242. Valid Anagrams
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Find the common length for comparison
        int c = arr1.length > arr2.length ? arr2.length : arr1.length;
            // Iterate through the arrays and compare characters
            for(int i=0; i< c; i++){
            // If characters at the same index are not equal, strings are not anagrams
            if(arr1[i]!= arr2[i]){
                return false;
            }
        }
        // After comparing characters in the common length, check if both arrays have the same length
        return arr1.length == arr2.length;
    }
}
