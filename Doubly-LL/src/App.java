public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LL x1 = new LL();
        x1.insertLast(10);
        x1.insertLast(20);
        x1.insertLast(30);
        x1.insertFirst(15);
        x1.insertLast(40);
        x1.printLL();
        // x1.removeFirst();
        // x1.printLL();
        // x1.removeLast();
        // x1.printLL();
        x1.removeAtPos(2);
        x1.printLL();
    }
}
