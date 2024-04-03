public class LL {
    private Node head, tail;

    LL() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null && tail == null;
    }

    void clear() {
        head = null;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // No changes
    public void printLL() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("*****************");
    }


    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) { // or if(head==tail)
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) { // or if(head==tail)
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;

    }


    // https://www.geeksforgeeks.org/introduction-to-doubly-linked-lists-in-java/
    public void removeAtPos(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            removeFirst();
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count != pos) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position wrong");
            return;

            
        }
        if (current == tail) {
            removeLast();
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
       
    }

}
