package T05_Recursion;

public class R07_first_occurrence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 2, 1, 3, 5, 3, 5, 3, 4, 4 };
        System.out.println(firOccr(arr, 4, 0));

    }

    public static int firOccr(int arr[], int k, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        }

        return firOccr(arr, k, i + 1);

    }
}
