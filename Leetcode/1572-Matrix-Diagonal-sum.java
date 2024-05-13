// Question ---> 1572. Matrix Diagonal Sum
//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

class Solution {
    public int diagonalSum(int[][] mat) {
        int psum =0;
        int ssum =0;
        int n = mat.length;
        // Calculate the sum of the primary diagonal
        for(int i=0; i<n; i++){
            psum += mat[i][i];
        }
        // Calculate the sum of the secondary diagonal
        for(int i=0; i<n; i++){
            ssum += mat[i][n-1-i];
        }
        // Adjust the sum of the primary diagonal if the matrix size is odd
        if(n%2 != 0){
            int mid = n/2;
            psum -= mat[mid][mid];
        }

        return psum + ssum;
    }
}
