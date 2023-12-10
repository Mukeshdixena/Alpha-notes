package T15_Heaps;

import java.util.PriorityQueue;

public class H08_sliding_window {

    static class Pair implements Comparable<Pair> {
        int idx;
        int val;

        Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        @Override
        public int compareTo(Pair w2) {
            return w2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int ans[] = new int[arr.length + 1 - k];

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(i, arr[i]));
        }

        ans[0] = pq.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(i, arr[i]));
            ans[i - k + 1] = pq.peek().val;
        }
        printArr(ans);
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
