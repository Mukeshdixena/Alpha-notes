// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

package Array;

public class AQ01_isUniqe {
    static boolean isUniqe(int arr[]) {

        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] > 1) {
                return true;
            }
        }

        return false;
    }
}
