package T06_DividAndConquer;

public class DQ03_count_of_inversions {

    // Brute force approach

    static int bruteForceApproach(int arr[]) {
        int inversionCount = 0;

        for (int i = 0; i < arr.length - 1; i++) { // * arr.length - 1

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

    // Modified Merge Sort

    static int merge(int arr[], int mid, int s, int e) {

        int temp[] = new int[e - s + 1];
        int count = 0;
        int i = s;
        int j = mid;
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        for (i = s, k = 0; i <= e; k++, i++) {
            arr[i] = temp[k];
        }
        return count;
    }

    static int util(int arr[], int s, int e) {
        if (s == e) {
            return 0;
        }
        int invCount = 0;

        int mid = s + (e - s) / 2;
        invCount += util(arr, s, mid);
        invCount += util(arr, mid + 1, e);
        invCount += merge(arr, mid, s, e);
        return invCount;
    }

    static int getInvCount(int arr[]) {
        return util(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

    }
}
