// Question ---> 682 Baseball Game
// You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
// You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
// An integer x.
// Record a new score of x.
// '+'.
// Record a new score that is the sum of the previous two scores.
// 'D'.
// Record a new score that is the double of the previous score.
// 'C'.
// Invalidate the previous score, removing it from the record.
// Return the sum of all the scores on the record after applying all the operations.

// The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>(); // List to store the scores

        // Iterate over each operation
        for (String ops : operations) {
            switch (ops) {
                case "C":
                    // Invalidate the previous score
                    if (!record.isEmpty()) {
                        record.remove(record.size() - 1);
                    }
                    break;

                case "D":
                    // Record a new score that is double the previous score
                    if (!record.isEmpty()) {
                        int lastScore = record.get(record.size() - 1);
                        record.add(lastScore * 2);
                    }
                    break;

                case "+":
                    // Record a new score that is the sum of the previous two scores
                    if (record.size() >= 2) {
                        int lastScore = record.get(record.size() - 1);
                        int secondLastScore = record.get(record.size() - 2);
                        record.add(lastScore + secondLastScore);
                    }
                    break;

                default:
                    // Record a new score which is an integer
                    int score = Integer.parseInt(ops);
                    record.add(score);
                    break;
            }
        }

        // Calculate the total score
        int totalScore = 0;
        for (int score : record) {
            totalScore += score;
        }

        return totalScore;
    }
}
