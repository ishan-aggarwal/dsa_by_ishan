package graphs.aditya_verma_series;

import graphs.day1.AdjacencyListGraph;

import java.util.ArrayList;
import java.util.List;


public class _2DFSTraversal {

    private static List<Integer> dfs(int sourceNode, List<List<Integer>> adjacencyList) {
        // result list to maintain the answer
        List<Integer> result = new ArrayList<>();
        // visited boolean array to mark the already visited nodes
        boolean[] visited = new boolean[adjacencyList.size()];

        // add source node to result
        result.add(sourceNode);
        // also mark the source node is visited
        visited[sourceNode] = true;

        // iterate over all the neighbours of the sourceNode
        for (Integer neighbour : adjacencyList.get(sourceNode)) {
            // if the neighbour is not already visited
            // callDFS function on it recursively
            if (!visited[neighbour]) {
                callDFS(neighbour, adjacencyList, visited, result);
            }
        }
        return result;
    }

    private static void callDFS(int currentNode, List<List<Integer>> adjacencyList, boolean[] visited, List<Integer> result) {
        result.add(currentNode);
        visited[currentNode] = true;
        for (Integer neighbour : adjacencyList.get(currentNode)) {
            if (!visited[neighbour]) {
                callDFS(neighbour, adjacencyList, visited, result);
            }
        }
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

        List<Integer> result = dfs(0, graph.adjacencyList);
        System.out.println(result);
    }
}
