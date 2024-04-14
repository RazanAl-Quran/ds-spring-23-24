public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Queue s1 = new Queue();
        s1.enqueue(5);
        s1.enqueue(2);
        s1.enqueue(6);
        s1.printStack();
        s1.dequeue();
        s1.printStack();
        System.out.println(s1.getFront());

        
      
    }
}
