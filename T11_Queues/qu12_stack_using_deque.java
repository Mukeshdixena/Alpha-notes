package T11_Queues;

import java.util.*;

public class qu12_stack_using_deque {
    public static void main(String[] args) {

    }

}

class Stack_12 {
    Deque<Integer> dq = new LinkedList<>();

    void push(int e) {
        dq.addLast(e);
    }

    int pop() {
        return dq.removeLast();
    }

    int peek() {
        return dq.getLast();
    }
}