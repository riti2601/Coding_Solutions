// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. 
// Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

// Return the minimum number of boats to carry every given person.

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0; 
        int j= people.length - 1;
        int ans = 0; 

        while(i<=j){
            ans++;
            // Check if the sum of weights of people at positions i and j is within the limit
            if(people[i] + people[j] <= limit){
                i++; // Move to the next lightest person
            }
            j--; // Move to the next heaviest person
        }
        return ans;

    }
}
