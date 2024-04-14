// Circular Array
// https://www.youtube.com/watch?v=JNrev_FBqF4
public class Queue2 {
    private int Q[];
    private int front;
    private int rear;

    Queue2(int size) {
        Q = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (((rear + 1) % Q.length) == front) { // if the next of rear equals to front
            return true;
        } else
            return false;
    }

    public void enqueue(int v) {
        if (isFull())
            return;
        else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % Q.length;
        }
        Q[rear] = v;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        } else if (front == rear) { // meaning one element in the array
            front = rear = -1;
        } else {
            Q[front] = 0;
            front = (front + 1) % Q.length;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        } else
            return Q[front];
    }

    public void printQueue() {
        for (int i = 0; i < Q.length; i++) {
            System.out.println(Q[i]);
        }
    }

}
