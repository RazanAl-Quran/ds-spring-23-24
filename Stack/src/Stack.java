public class Stack {
    private LL x; //composition
    Node top;

    Stack() {
        x = new LL();
        top = null;
    }

    public void push(int v) {
        // End >> O(n)
        // x.insertLast(v);
        // top = x.getLast();

        // Start >> O(1)
        x.insertFirst(v);
        top = x.getHead();
    }
    
    public void pop() {
        // End >> O(n)
        // x.removeLast();
        // top = x.getLast();

        // Start >> O(1)
        x.removeFirst();
        top = x.getHead();
    }

    int getTop() {
        if (!isEmpty()) {
            return top.value;
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

