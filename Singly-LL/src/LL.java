public class LL {
    private Node head;

    LL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = null;
    }

    public void insertFirst(int v) {
        Node newNode = new Node(v);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int v) {
        Node newNode = new Node(v);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

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
        System.out.println("***********************");

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;

        // if(head.next == null) {
        // head = null;
        // return;
        // }
        // if (head.next != null) {
        // head = head.next;
        // return;
        // }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    public void removeElement(int element) {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.value == element) {
            head = head.next;
            return;
        }

        // Method 1: without using prev
        // Node current = head;

        // while (current != null && current.next.value != element) {
        // current = current.next;
        // }
        // if (current == null) {
        // System.out.println("LL doesn't have this value");
        // return;
        // }
        // current.next = current.next.next;


        // Method 2: with using prev
        Node current = head;
        Node prev = null;

        while (current != null && current.value != element) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("LL doesn't have this value");
            return;
        }
        prev.next = current.next;

    }

    public void mergeLL(LL x2) {
        // do it by yourself dear
    }

}
