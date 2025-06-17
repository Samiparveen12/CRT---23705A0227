import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int vertices; // number of vertices
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();

        // Initialize adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add edge from source to destination
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    // Print the adjacency list representation of the graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5); // graph with 5 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
