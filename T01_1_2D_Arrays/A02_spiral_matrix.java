package T01_1_2D_Arrays;

public class A02_spiral_matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (i * 4) + j + 1;
            }
        }
        print_in_spiral(matrix);
    }

    public static void print_in_spiral(int matrix[][]) {
        int s_row = 0;
        int e_row = matrix.length - 1;
        int s_col = 0;
        int e_col = matrix[0].length - 1;

        while (s_row <= e_row && s_col <= e_col) {

            // Print top row
            for (int col = s_col; col <= e_col; col++) {
                System.out.print(matrix[s_row][col] + " ");
            }
            s_row++;

            // Print right column
            for (int row = s_row; row <= e_row; row++) {
                System.out.print(matrix[row][e_col] + " ");
            }
            e_col--;

            // Print bottom row
            if (s_row <= e_row) {
                for (int col = e_col; col >= s_col; col--) {
                    System.out.print(matrix[e_row][col] + " ");
                }
                e_row--;
            }

            // Print left column
            if (s_col <= e_col) {
                for (int row = e_row; row >= s_row; row--) {
                    System.out.print(matrix[row][s_col] + " ");
                }
                s_col++;
            }
        }
    }

}
