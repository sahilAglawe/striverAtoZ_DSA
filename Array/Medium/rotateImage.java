class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length-1; i++)
        {
            for(int j =i+1 ; j < matrix[0].length; j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}

// T/C: O(n^2) for both transposing and reversing the matrix

// In the above program, we first transpose the matrix by swapping elements across the diagonal.
// then we reverse each row of the transposed matrix to  acheive the final rotated matrix.
// This is done in-place without using any extra space, making it efficient in terms of both time and space complexity.
// the final rotated matrix is obtained by first transposing the original matrix and then reversing each row of the transposed matrix.