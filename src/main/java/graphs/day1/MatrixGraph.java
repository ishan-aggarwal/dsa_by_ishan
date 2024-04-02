package graphs.day1;

public class MatrixGraph extends Graph {
    private final int[][] matrix;

    public MatrixGraph(int vertices) {
        super(vertices);
        this.matrix = new int[vertices][vertices];
    }

    @Override
    public void addEdge(int s, int e) {
        matrix[s][e] = 1;
        matrix[e][s] = 1;
    }

    public static void main(String[] args) {
        int vertices = 5;

        // Create a graph
        MatrixGraph graph = new MatrixGraph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);


        for (int i = 0; i < graph.matrix.length; i++) {
            for (int j = 0; j < graph.matrix[0].length; j++) {
                System.out.print(graph.matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
