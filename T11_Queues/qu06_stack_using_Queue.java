package T11_Queues;

import java.util.*;

public class qu06_stack_using_Queue {

}

class stack_061 { // push O(n)
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(Integer ele) {
        if (q1.isEmpty()) {
            q1.add(ele);

            while (!q2.isEmpty()) {
                Integer temp = q2.poll();
                q1.add(temp);
            }
        } else {
            q2.add(ele);

            while (!q1.isEmpty()) {
                Integer temp = q1.poll();
                q2.add(temp);
            }
        }
    }

    Integer poll() {
        if (q1.isEmpty()) {
            Integer temp = q2.poll();
            return temp;
        } else {
            Integer temp = q1.poll();
            return temp;
        }
    }

    Integer peek() {
        if (q1.isEmpty()) {
            Integer temp = q2.peek();
            return temp;
        } else {
            Integer temp = q1.peek();
            return temp;
        }
    }
}

class stack_062 { // pull O(n)
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(Integer ele) {
        if (q1.isEmpty()) {
            q2.add(ele);
        } else {
            q1.add(ele);
        }
    }

    int poll() {

        if (isEmpty()) {
            System.out.println("stack is empty ");
            return -1;
        }

        if (q1.isEmpty()) {
            int temp = q2.peek();
            while (!q2.isEmpty()) {
                temp = q2.poll();
                q1.add(temp);
            }
            q2.remove(temp);
            return temp;
        } else {
            int temp = q1.peek();
            while (!q1.isEmpty()) {
                temp = q1.poll();
                q1.add(temp);
            }
            q2.remove(temp);
            return temp;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty ");
            return -1;
        }
        if (q1.isEmpty()) {
            int temp = q2.peek();
            while (!q2.isEmpty()) {
                temp = q2.poll();
                q1.add(temp);
            }
            return temp;
        } else {
            int temp = q1.peek();
            while (!q1.isEmpty()) {
                temp = q1.poll();
                q1.add(temp);
            }
            return temp;
        }
    }
}

class stack_0621 { // pull O(n)
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(Integer ele) {
        if (q1.isEmpty()) {
            q2.add(ele);
        } else {
            q1.add(ele);
        }
    }

    int poll() {

        if (isEmpty()) {
            System.out.println("stack is empty ");
            return -1;
        }

        int top = -1;
        if (q1.isEmpty()) {

            while (!q2.isEmpty()) {
                top = q2.poll();
                if (q2.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
            return top;
        } else {

            while (!q1.isEmpty()) {
                top = q1.poll();
                if (q1.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
            return top;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty ");
            return -1;
        }

        int top = -1;
        if (q1.isEmpty()) {
            while (!q2.isEmpty()) {
                top = q2.poll();

                q1.add(top);
            }
        } else {
            while (!q1.isEmpty()) {
                top = q1.poll();

                q1.add(top);
            }
        }
        return top;
    }
}
