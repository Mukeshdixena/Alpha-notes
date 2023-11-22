// Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

package T01_1_2D_Arrays;

public class AQ02_sum_of_selected_row {
    public static int sum_of_selected_row(int matrix[][], int row) {
        int sum = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            sum += matrix[row][col];
        }

        return sum;
    }
}
