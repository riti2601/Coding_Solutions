//Question --> 1491. Average Salary Excluding Minimum and Maximum Salary
//You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
//Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.


class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary); // Sort the array to easily exclude the minimum and maximum salaries

        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i]; // Sum all elements except the first and last one
        }

        // Calculate the average by dividing the sum by the number of elements considered
        double ans = sum / (salary.length - 2);
        return ans; // Return the calculated average
    }
}
