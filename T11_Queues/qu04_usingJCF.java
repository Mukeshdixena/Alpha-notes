package T11_Queues;

import java.util.*;

// import java.util.Queue;
// import java.util.PriorityQueue;
// import java.util.ArrayDeque;
// import java.util.LinkedList;

public class qu04_usingJCF {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        // Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(4);
        q.add(5);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}