public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Graph graph = new Graph(4);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 20);
        graph.addEdge(1, 2, 30);
        graph.addEdge(1, 3, 40);
        graph.addEdge(2, 3, 50);

        System.out.println("Graph:");
        graph.printGraph();
    }
}
