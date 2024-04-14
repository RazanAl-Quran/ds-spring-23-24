public class Queue {

    private LL x; //composition
    Node front; // dequeue

    Queue() {
        x = new LL();
        front = null;
    }

    // enqueue to the end and dequeue from the beginning  
    // OR
    // enqueue to the beginning and dequeue from the end
    void enqueue(int v) {
        // End O(n)
        x.insertLast(v);
        front = x.getHead();

        // Beginning O(1)
        // x.insertFirst(v);
        // front = x.getLast();
    }

    void dequeue() {
        // Beginning O(1)
        x.removeFirst();
        front = x.getHead();

        // End O(n)
        // x.removeLast();
        // front = x.getLast();

    
    }
  
    int getFront() {
        if (!isEmpty()) {
            return front.value;
        }
        return -1;
    }

    boolean isEmpty() {
        return x.isEmpty();
    }

    void printStack() {
        x.printLL();
    }
}
