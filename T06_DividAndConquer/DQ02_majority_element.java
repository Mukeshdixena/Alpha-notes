
// Given an array nums of size n, returnthe majority element.
//The majority element is the element that appears more than ⌊n/2⌋ times.
// You may assume that the majority element always exists in the array.
package T06_DividAndConquer;

public class DQ02_majority_element {

    // Approach 1

    // Count the number of times each number occurs in the array & find the largest
    // count.Time complexity - O(n^2)

    // try by me
     static int bruteForceApproach(int nums[]) {
        int frequency[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            frequency[i] = count;
        }

        for (int i = 0; i < nums.length; i++) {
            if (frequency[i] >= nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    // form solution
     static int bruteForceApproach2(int arr[]) {
        int mejority = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > mejority) {
                return arr[i];
            }
        }
        return -1;
    }

    // Approach 2

     static int countInRange(int arr[], int num, int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

     static int util(int arr[], int s, int e) {
        if (s == e) {
            return arr[s];
        }

        int mid = s + (e - s) / 2;
        int left = util(arr, s, mid);
        int right = util(arr, mid + 1, e);
        if (left == right) {
            return left;
        }

        int leftCount = countInRange(arr, left, s, e);
        int rightCount = countInRange(arr, right, s, e);

        if (leftCount > rightCount) {
            return left;
        } else {
            return right;
        }
    }

     static int mejorityElement(int arr[]) {
        return util(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

    }
}