package graphs.day1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFSTraversal {

    public static void bfs(int startNode, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        // this will run for each vertex of the graph exactly once
        while (!queue.isEmpty()) {
            Integer currentVertex = queue.poll();
            if (currentVertex == null) return;

            // start printing in bfs fashion
            System.out.print(currentVertex + " ");

            // we know total there 2E edges in the graph for V vertex
            // so this will run a maximum of 2E times (we already have condition for if already visited)
            for (Integer children : adjList.get(currentVertex)) {
                if (!visited[children]) {
                    queue.add(children);
                    visited[children] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Number of vertices in the graph
        int vertices = 5;

        // Create a graph
        AdjacencyListGraph graph = new AdjacencyListGraph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.print("Breadth First Traversal starting from vertex 0: ");
        bfs(0, graph.getAdjacencyList());
    }
}
