package T11_Queues;

import java.util.*;

class qu05_usingStack {

    static class Queue052 { // peek & poll O(n) && push O(1)
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        boolean isEmpty() {
            return s1.isEmpty();
        }

        void push(Integer e) {
            s1.push(e);
        }

        Integer peek() {

            // move all element from s1 to s2
            while (!s1.isEmpty()) {
                Integer temp = s1.pop();
                s2.push(temp);
            }

            // peak element is top to the s2

            Integer peekEle = s2.peek();

            // move all element from s2 to s1

            while (!s2.isEmpty()) {
                Integer temp = s2.pop();
                s1.push(temp);
            }
            return peekEle;
        }

        Integer poll() {

            // move all element from s1 to s2
            while (!s1.isEmpty()) {
                Integer temp = s1.pop();
                s2.push(temp);
            }

            // peak element is top to the s2

            Integer peekEle = s2.pop();

            // move all element from s2 to s1

            while (!s2.isEmpty()) {
                Integer temp = s2.pop();
                s1.push(temp);
            }
            return peekEle;
        }

    }

    static class Queue051 { // push O(n) && peek & poll O(1)
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        boolean isEmpty() {
            return s1.isEmpty();
        }

        void add(int x) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
                // s1.pop();
            }

            // Push item into s1
            s1.push(x);

            // Push everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
                // s2.pop();
            }
        }

        // remove an item from the queue051
        int remove() {
            // if first stack is empty
            if (s1.isEmpty()) {
                System.out.println("Q is Empty");
                System.exit(0);
            }

            // Return top of s1
            int x = s1.peek();
            s1.pop();
            return x;
        }

        int peek() {
            // if first stack is empty
            if (s1.isEmpty()) {
                System.out.println("Q is Empty");
                System.exit(0);
            }

            // Return top of s1

            return s1.peek();
        }
    }

    // Driver code
    public static void main(String[] args) {
        Queue051 q = new Queue051();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}