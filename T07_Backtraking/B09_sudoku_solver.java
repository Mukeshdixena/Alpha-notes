package T07_Backtraking;

public class B09_sudoku_solver {
    public static void main(String[] args) {

    }

    public static boolean sudoku_solver(int sudoku[][]) {
        return util(sudoku, 0, 0);
    }

    public static boolean util(int sudoku[][], int r, int c) {
        // base case
        if (r == 9) {
            return true;
        }

        int nextRow = r, nextCol = c + 1;
        if (nextCol == 9) {
            nextRow = r + 1;
            nextCol = 0;
        }
        if (sudoku[r][c] != 0) {
            return util(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, r, c, digit)) {
                sudoku[r][c] = digit;
                if (util(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[r][c] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        for (int r = 0; r <= 8; r++) {
            if (sudoku[r][col] == digit) {
                return false;
            }
        }

        for (int c = 0; c <= 8; c++) {
            if (sudoku[row][c] == digit) {
                return false;
            }
        }

        int subGridStrartingRow = (row / 3) * 3;
        int subGridStrartingCow = (col / 3) * 3;

        for (int i = subGridStrartingRow; i < subGridStrartingCow + 3; i++) {
            for (int j = subGridStrartingCow; j < subGridStrartingCow + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}
