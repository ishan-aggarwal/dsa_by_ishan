package graphs.day1;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph extends Graph {

    private final List<List<Integer>> adjacencyList;

    public AdjacencyListGraph(int vertices) {
        super(vertices);
        this.adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(i, new ArrayList<>());
        }
    }

    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    @Override
    public void addEdge(int s, int e) {
        this.adjacencyList.get(s).add(e);
        this.adjacencyList.get(e).add(s);
    }

    public static void main(String[] args) {
        int vertices = 5;

        // Create a graph
        AdjacencyListGraph graph = new AdjacencyListGraph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);


        for (int i = 0; i < graph.adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < graph.adjacencyList.get(i).size(); j++) {
                System.out.print(graph.adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
