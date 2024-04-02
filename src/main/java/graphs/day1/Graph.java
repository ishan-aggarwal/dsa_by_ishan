package graphs.day1;

public abstract class Graph {
    private final int vertices;

    public Graph(int vertices) {
        this.vertices = vertices;
    }

    public abstract void addEdge(int s, int e);

    public int getVertices() {
        return vertices;
    }
}
