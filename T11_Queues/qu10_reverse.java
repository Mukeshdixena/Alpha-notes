package T11_Queues;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class qu10_reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverse(q);
        System.out.println(q);

    }

    static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
}
