package T11_Queues;

import java.util.*;

public class qu11_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.add(2);
        dq.addLast(3);
        System.out.println(dq);
    }
}
