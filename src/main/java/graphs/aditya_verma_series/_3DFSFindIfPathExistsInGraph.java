package graphs.aditya_verma_series;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-if-path-exists-in-graph/description/
// 1971. Find if Path Exists in Graph
public class _3DFSFindIfPathExistsInGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // declare and prepare an adjList
        List<List<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // insert data into the adjList
        // since the input is bidirectional we add two edges
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // create a boolean visited array
        boolean[] visited = new boolean[n];

        // since we need to start from source node
        // so mark the source node as visited
        visited[source] = true;

        // iterate over all the children of source node
        for (int children : adjList.get(source)) {
            // if the children is not yet visited
            if (!visited[children]) {
                // callDFS function from the children
                callDFS(children, visited, adjList);
            }
        }
        // check what is the value present at destination index of visited boolean array
        return visited[destination];
    }

    private static void callDFS(int vertex, boolean[] visited, List<List<Integer>> adjList) {
        visited[vertex] = true;
        for (int children : adjList.get(vertex)) {
            if (!visited[children]) {
                callDFS(children, visited, adjList);
            }
        }
    }
}