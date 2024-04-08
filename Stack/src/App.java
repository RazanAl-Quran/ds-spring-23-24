public class App {
    public static void main(String[] args) throws Exception {
       
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(2);
        s1.push(6);
        s1.printStack();
        s1.pop();
        s1.printStack();
        System.out.println(s1.getTop());
    }
}
