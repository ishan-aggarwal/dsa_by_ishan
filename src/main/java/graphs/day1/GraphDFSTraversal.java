package graphs.day1;

import java.util.ArrayList;
import java.util.List;

public class GraphDFSTraversal {

    public static List<Integer> dfsOfGraph(int startNode, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];
        List<Integer> path = new ArrayList<>();

        // add the starting node to path
        // and set the visited to true for it
        visited[startNode] = true;
        path.add(startNode);

        // get all the children of starting node and iterate over them one by one
        for (Integer node : adjList.get(startNode)) {
            // if the children is not already visited by any other path
            if (!visited[node]) {
                // call dfs on the childrenNode
                dfs(node, adjList, visited, path);
            }
        }
        return path;
    }

    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> path) {

        // set the visited for the child node first
        visited[node] = true;
        // add the child node to path
        path.add(node);

        // get the AdjacencyList for the childrenNode
        for (Integer children : adjList.get(node)) {
            // if the children is not already visited by any other path
            if (!visited[children]) {
                // call dfs on the children again
                dfs(children, adjList, visited, path);
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
        graph.addEdge(0, 3);
        graph.addEdge(2, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.print("Depth First Traversal starting from vertex 0: ");
        List<Integer> path = dfsOfGraph(0, graph.getAdjacencyList());
        System.out.println(path);
    }
}
