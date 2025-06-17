import java.util.HashSet;
public class Main{
public static void main(String[] args){
int numVertices = 5;
Graph graph = new Graph (numVertices, false);
graph.addEdge (0,1);
graph.addEdge (0,1);
graph.addEdge (1,2);
graph.addEdge (1,3);
graph.addEdge (1,4);
graph.printGraph();
class Edge{
int arc;
int dest;
int weight;
Edge (int arc, int dest, int weight){
    this.src = src;
    this.dest =  dest;
    this.weight = weight;
}
Edge (int src, int dest){
    this.src = src;
    this.dest = dest;
    this.weight= 1;
}
}
class Graph{
    HashSet<Edge>graph;
    int vertices;
    this.src = src;
    this.dest = dest;
    this.weight = 1;
}
}
class Graph{
    HashSet<Edge>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices, boolean inDirected)(
        this.vertices = vertices;
        this.inDirected = isDirected;
        graph = new HashSet<Edge>();
}
public void addEdge(int src, int dest) {
if (isValid(arc,dest)){
Edge e = new Edge(src,dest);
graph.add(e);
if(!isDirected){
Edge e2 = new Edge (dest, src);
graph.add(e2);
}
}else {
System.out.println("Invalid source and Destination");
}
}
public void addEdge (int src, int dest, int weight){
if(isValid (src,dest)) {
Edge e  new Edge (src,dest,weight);
graph.add(e);
if(!inDirected) {
Edge e2 = new Edge (dest, arc, weight);
graph.add(e2);
}
}else {
System.out.println("Invalid source and Destination");
}
}
public boolean isValid(int src, int dest) {
    retuen src >=0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
}
public void printGraph(){
System.out.println("Graph represented by Edge list:");
for (Edge e : graph) {
    System.out.println(e.src+"->" + e.dest + "[weight = " + e.weight + "]");
}
}
}
