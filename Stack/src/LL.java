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

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
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
            System.out.println("LL is empty!!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("************************");

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("LL is empty!!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        if (head.next != null) {
            head = head.next;
            return;
        }

        // or head = head.next;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LL is empty!!");
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
        if(isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.value == element) {
            head = head.next; 
            return;
            // removeFirst();
        }

        // without using  prev
        // Node current = head;

        // while (current != null && current.next.value != element) {
        //     current = current.next;
        // }
        // if (current == null) {
        //     System.out.println("LL doesn't have this value");
        //     return;
        // }
        // current.next = current.next.next;


        // with using prev
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

    public void mergeLL(LL LL2) {

    }

    public Node getLast() {
        if(isEmpty()) {
            return null;
        }
        Node current = head;
        while(current.next!=null) {
            current= current.next;
        }
        return current;
    }

    public Node getHead() {
        if(isEmpty()) {
            return null;
        } 
        return head;
    }

}
