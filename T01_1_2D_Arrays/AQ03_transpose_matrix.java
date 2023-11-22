package T01_1_2D_Arrays;

public class AQ03_transpose_matrix {
    public static int[][] transpose_matrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transposed_matrix[][] = new int[col][row];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                transposed_matrix[c][r] = matrix[r][c];
            }
        }

        return transposed_matrix;
    }
}
