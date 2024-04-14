public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Queue a = new Queue(10);
        a.enqueue(90);
        a.enqueue(50);
        a.enqueue(20);
        a.enqueue(990);
        a.printQueue();
        System.out.println("Front>>" + a.getFront());
        a.dequeue();
        a.printQueue();
        System.out.println("Front>>" + a.getFront());


        // Queue2 a2 = new Queue2(4);
        // a2.enqueue(90);
        // a2.enqueue(50);
        // a2.enqueue(20);
        // a2.enqueue(990);
        // a2.printQueue();
        // System.out.println("Front>>" + a2.getFront());
        // a2.dequeue();
        // a2.dequeue();
        // a2.printQueue();
        // System.out.println("Front>>" + a2.getFront());
        // a2.enqueue(70);
        // a2.enqueue(80);
        // a2.enqueue(60); //wont be enqueued
        // a2.printQueue();
        // System.out.println("Front>>" + a2.getFront());


    }
}
