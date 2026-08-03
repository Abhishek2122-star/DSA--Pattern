class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] colMax = new int[cols];

        // Step 1: Find maximum value of each column
        for(int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }

            colMax[j] = max;
        }

        // Step 2: Replace -1 with column maximum
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }

        return matrix;
    }
}
    
