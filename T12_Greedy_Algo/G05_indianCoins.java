package T12_Greedy_Algo;

import java.util.*;

public class G05_indianCoins {
    public static void main(String[] args) {

    }

    static void indianCoins(int n) {
        Integer arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };
        Arrays.sort(arr, Comparator.reverseOrder());
        int amount = n;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] <= amount) {
                count++;
                amount -= arr[i];
                list.add(arr[i]);
            }
        }
        System.out.println(count);
        System.out.println(list);
    }

    static void indianCoins2(int n) {
        Integer arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };
        Arrays.sort(arr, Comparator.reverseOrder());
        int amount = n;
        int count = 0;
        // ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= amount) {
                int num = amount / arr[i];
                count += num;
                amount = amount % arr[i];
                // while (num-- > 0) {
                //     list.add(arr[i]);
                // }
            }
        }
        System.out.println(count);
        // System.out.println(list);
    }

}
