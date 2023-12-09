package T11_Queues;

import java.util.*;

public class u13_queue_using_deque {

}

class Queue_13 {
    Deque<Integer> dq = new LinkedList<>();

    void add(int e) {
        dq.addLast(e);
    }

    int poll() {
        return dq.removeFirst();
    }

    int peek() {
        return dq.getFirst();
    }
}