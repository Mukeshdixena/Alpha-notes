package T11_Queues;

public class qu02_usingCircularArr {

    public static void main(String[] args) {
        queue02 qu = new queue02(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }
    }
}

<<<<<<< HEAD
class queue02 {
    static int arr[];
    static int size;
    static int rear;
    static int front;
=======
class Queue {
    int arr[];
    int size;
    int rear;
    int front;
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122

    queue02(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    boolean isfull() {
        return (rear + 1) % size == front;
    }

    void add(int data) {
        if (isfull()) {
            System.out.println("queue is full");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % size;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }
        return arr[0];
    }
}
