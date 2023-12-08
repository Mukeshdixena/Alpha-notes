package T11_Queues;

public class qu03_usingLL {
    public static void main(String[] args) {
<<<<<<< HEAD
        queue03 q = new queue03();
=======
        queue_3 q = new queue_3();
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.front());
            q.remove();
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

<<<<<<< HEAD
class queue03 {
=======
class queue_3 {
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
    static Node head;
    static Node tail;

    boolean isEmpty() {
        return head == null && tail == null;
    }

    void add(int data) {

        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    void remove() {
        if (isEmpty()) {
            System.out.println("que is emply");

        }

        head = head.next;
        if (head == null) {
            tail = null;
        }

    }

    int front() {
        if (isEmpty()) {
            System.out.println("que is emply");
            return -1;
        }
        return head.data;
    }
}