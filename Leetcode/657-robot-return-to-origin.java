//Question --> Robot Return to Origin
//There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
// You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
// Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
// Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

class Solution {
    public boolean judgeCircle(String moves) {
        // Convert the string moves to a character array
        char[] arr = moves.toCharArray();
        
        // Initialize counters for each direction
        int u = 0, d = 0, l = 0, r = 0;
        
        // Iterate over each character in the array
        for (char c : arr) {
            // Use a switch statement to count occurrences of each direction
            switch (c) {
                case 'U': 
                    u++; // Increment up counter for 'U'
                    break;
                case 'D': 
                    d++; // Increment down counter for 'D'
                    break;
                case 'L': 
                    l++; // Increment left counter for 'L'
                    break;
                case 'R': 
                    r++; // Increment right counter for 'R'
                    break;
            }
        }
        
        // Check if the number of 'U's equals the number of 'D's
        // and the number of 'L's equals the number of 'R's
        if (u != d || l != r) {
            return false; // If not, the robot does not return to the origin
        } else {
            return true; // If yes, the robot returns to the origin
        }
    }
}
