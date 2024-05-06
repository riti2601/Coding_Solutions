// Question 1768. Merge String Alternatly
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int tl = arr1.length + arr2.length;
        char[] res = new char[tl];
        int i=0, j=0, k=0;

        // Merge characters alternately from arr1 and arr2
        while (i < arr1.length && j < arr2.length) {
            res[k++] = arr1[i++];
            res[k++] = arr2[j++];
        }

        // Append remaining characters from arr1
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }

        // Append remaining characters from arr2
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        // Convert the result array to a string
        return new String(res);
    }
}
