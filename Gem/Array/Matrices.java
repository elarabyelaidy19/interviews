package Gem.Array;

public class Matrices {
    class NumMatrix {

        private int[][] sum;

        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0) {
                sum = null;
                return;
            }

            sum = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    sum[i][j] = matrix[i][j];

                    if (i > 0) {
                        sum[i][j] += sum[i - 1][j];
                    }
                    if (j > 0) {
                        sum[i][j] += sum[i][j - 1];
                    }
                    if (i > 0 && j > 0) {
                        sum[i][j] -= sum[i - 1][j - 1];
                    }
                }

            }
        }

        private int getSum(int row, int col) {
            if (sum == null)
                return 0;
            if (row < 0 || col < 0)
                return 0;
            return sum[row][col];
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int total = getSum(row2, col2);
            int extra = getSum(row2, col1 - 1) - getSum(row1 - 1, col1 - 1) + getSum(row1 - 1, col2);
            return total - extra;
        }
    }


}
