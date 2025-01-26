package graphs.aditya_verma_series;

import graphs.day1.AdjacencyListGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1BFSTraversal {

    public static List<Integer> bfs(int startNode, List<List<Integer>> adjList) {
        List<Integer> result = new ArrayList<>();

        // maintaining a visited array to check if the node is already visited or not
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            result.add(currentNode);
            for (Integer neighbour : adjList.get(currentNode)) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int vertices = 6;

        // Create a graph
        AdjacencyListGraph graph = new AdjacencyListGraph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        List<Integer> result = bfs(0, graph.adjacencyList);
        System.out.println(result);
    }
}
