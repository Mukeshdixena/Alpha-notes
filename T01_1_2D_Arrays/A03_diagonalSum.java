package T01_1_2D_Arrays;

public class A03_diagonalSum {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (i * 4) + j + 1;
            }
        }
        diagonalSum(matrix);
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if ((matrix[0].length - i - 1) != i) {
                sum += matrix[i][matrix[0].length - i - 1];
            }
        }
        System.err.println(sum);
    }
}
