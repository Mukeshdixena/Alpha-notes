package T06_DividAndConquer;

public class DQ01_merge_sort_for_array_of_string {

    public static void main(String[] args) {

    }

     static void mergeSort(String arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);

    }

     static void merge(String arr[], int s, int mid, int e) {
        String temp[] = new String[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= e) {
            if (isAlphabeticalSmaller(arr[i] , arr[j])) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= e) {
            temp[k++] = arr[j++];
        }

        k = 0;
        i = s;
        while (k < temp.length) {
            arr[i] = temp[k];
        }
    }

     static boolean isAlphabeticalSmaller(String s1, String s2) {

        if (s1.compareTo(s2) < 0) {
            return true;
        }
        return false;
    }

}
