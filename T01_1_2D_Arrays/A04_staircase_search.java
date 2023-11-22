package T01_1_2D_Arrays;

public class A04_staircase_search {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (i * 4) + j + 1;
            }
        }
        staircase_search(matrix, 3);
    }

    public static boolean staircase_search(int matrix[][], int key) {

        int r = matrix.length - 1;
        int c = 0;
        while (r >= 0 || c < matrix[0].length) {
            if (key == matrix[r][c]) {
                System.out.println(r + " " + c);
                return true;
            } else if (key < matrix[r][c]) {
                r--;
            } else {
                c++;
            }
        }

        return false;
    }
}
