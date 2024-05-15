import java.util.Arrays;

public class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
        // Initialize all elements of the matrix to infinity (indicating no edge)
        for (int i = 0; i < numVertices; i++) {
            Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE); //filling each row of the adjacency matrix with the value Integer.MAX_VALUE.
        }
        // you can use nested for loop instead
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        // adjacencyMatrix[destination][source] = weight; //undirected
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == Integer.MAX_VALUE) {
                    System.out.print("∞ \t");
                } else {
                    System.out.print(adjacencyMatrix[i][j] + " " +"\t");
                }
            }
            System.out.println();
        }
    }
}
