public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    // Initialize the adjacency matrix
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edge between source and destination (undirected graph)
    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    // Remove edge between source and destination
    public void removeEdge(int source, int destination) {
        adjMatrix[source][destination] = 0;
        adjMatrix[destination][source] = 0;
    }

    // Print the adjacency matrix
    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printMatrix();
    }
}
