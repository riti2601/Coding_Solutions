//template that can be used in most of the substring questions

public class SubstringTemplate {

    public int findSubstring(String s) {
        int[] map = new int[128]; // Character frequency array (assuming ASCII characters)
        int counter; // Check whether the substring is valid
        int begin = 0, end = 0; // Two pointers, one points to tail and one to head
        int d = 0; // The length of the substring

        // Initialize the character frequency array
        // You might initialize map here if necessary

        while (end < s.length()) {
            // Process the character at the end pointer and move the pointer forward
            if (map[s.charAt(end++)]-- > 0) {
                // Modify counter here
            }

            while (/* counter condition */) {
                // Update d here if finding minimum

                // Move the begin pointer forward to make the substring invalid/valid again
                if (map[s.charAt(begin++)]++ > 0) {
                    // Modify counter here
                }
            }

            // Update d here if finding maximum
        }

        return d;
    }

   
