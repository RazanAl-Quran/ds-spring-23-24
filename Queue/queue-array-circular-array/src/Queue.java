public class Queue {
    private int Q[];
    private int front;
    private int rear;

    Queue(int size) {
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
        if (rear == Q.length - 1) {
            return true;
        } else
            return false;
    }

    // we enqueue to the end (rear)
    // rear++
    public void enqueue(int v) {
        if (isFull())
            return;
        else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        Q[rear] = v;
    }

    // we dequeue from the front (front)
    // front++
    public void dequeue() {
        if (isEmpty()) {
            return;
        } else if (front == rear) { // meaning one element in the array
            front = rear = -1;
        } else {
            Q[front] = 0;
            front++;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        } else return Q[front];
    }

    public void printQueue() {
        for (int i = 0; i < Q.length; i++) {
            System.out.println(Q[i]);
        }
    }

}
