// QUESTION --> Given a 0-indexed string word and a character ch, reverse the segment of the word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in Word, do nothing.
// For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

class Solution {
    public String reversePrefix(String word, char ch) {
        int a = -1;
      // a loop to find the index of the ch 
        for(int i=0; i < word.length(); i++){
          // assigning ch to a 
            if(word.charAt(i) == ch){
                a = i;
                break;
            } 
        }
      //If ch is not found in the word, we return the word itself
        if(a == -1){
            return word;
        }
      // ch found at index a, create a new string to store the reverse part of the string word
        String rev="";
      // for loop to access each character of the string and concatenate it with rev
        for(int i=a; i>=0; i--){
            rev += word.charAt(i);
        }
      // finding the remaining part of the string word that is not reversed 
        String rem = word.substring(a+1);
     // concatenate the both strings rev and rem
        return (rev+rem);

    }
}
