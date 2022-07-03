package l24;
import java.util.*;
public class UndirectedGraph {
    private int numVertices;
    private int numEdges;
    private int [][]adjMatrix;
    public UndirectedGraph(int v, int e) {
        this.numVertices = v;
        this.numEdges = e;
        adjMatrix = new int[2*numVertices][2*numVertices];

    }

    void print() {
        if (numVertices == 0) {
            System.out.println("Matrix is empty");
            return;
        } else {
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    System.out.print(adjMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
    void insertVertex(int numEdges, int existingVertices[]) {
        numVertices++;
        for (int i = 0; i < numVertices; i++) {
            adjMatrix[i][numVertices - 1] = 0;
            adjMatrix[numVertices - 1][i] = 0;
        }
        for (int i = 0; i < numEdges; i++) {
            if (existingVertices[i] >= 0 && existingVertices[i] <= numVertices - 1) {
                adjMatrix[existingVertices[i]][numVertices - 1] = 1;
                adjMatrix[numVertices - 1][existingVertices[i]] = 1;
            } else {
                System.out.println("Invalid vertex");
            }
        }
    }
    void insertEdge(int source, int destination) {
        if (source < numVertices && destination < numVertices && source >= 0 && destination >= 0) {
            if (adjMatrix[source][destination] == 1) {
                System.out.println("Edge already exists");
                return;
            }
            adjMatrix[source][destination] = 1;
            adjMatrix[destination][source] = 1;
        } else {
            System.out.println("Invalid vertex");
            return;
        }
    }
    void deleteVertex(int delVertex) {
        if (numVertices == 0) {
            System.out.println("Matrix is empty");
            return;
        }
        if (delVertex < 0 && delVertex >= numVertices) {
            System.out.println("Invalid vertex");
            return;
        }
        int j = delVertex;
        for (int i = j; i < numVertices - 1; i++) {
            for (int k = 0; k < numVertices; k++) {
                adjMatrix[k][i] = adjMatrix[k][i + 1];
            }
        }
        for (int i = j; i < numVertices - 1; i++) {
            for (int k = 0; k < numVertices; k++) {
                adjMatrix[i][k] = adjMatrix[i + 1][k];
            }
        }
        numVertices--;
    }
    void deleteEdge(int source, int destination) {
        if (source < numVertices && destination < numVertices && source >= 0 && destination >= 0) {
            if (adjMatrix[source][destination] == 0) {
                return;
            }
            adjMatrix[source][destination] = 0;
            adjMatrix[destination][source] = 0;
        } else {
            System.out.println("Invalid vertex");
            return;
        }
    }

    public static void main(String []args) {
        int source, destination, i, j, op;
        int v,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices (The verticies will be numbered 0,1,2 and so on): ");
        v = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        e = sc.nextInt();
        UndirectedGraph g = new UndirectedGraph(v,e);
        for (i = 1; i <= e; i++) {
            System.out.print("Enter source: ");
            source = sc.nextInt();
            System.out.print("Enter destination: ");
            destination = sc.nextInt();;
            if (source >= v || destination >= v || source < 0 || destination < 0) {
                System.out.print("Invalid index. Try again.\n");
                i--;
                continue;
            } else {
                g.insertEdge(source,destination);
            }
        }
        while (true) {
            System.out.print("1.Insert vertex 2.Insert edge 3.Delete vertex 4.Delete edge 5.Print adjacency matrix 6.Exit\n");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();
            switch(op) {
                case 1:
                    int existingVertices[];
                    existingVertices = new int[v];
                    int numEdges;
                    System.out.print("Enter the number edges connecting the existing vertices to new vertex: ");
                    numEdges = sc.nextInt();
                    System.out.print("Enter the source of each edge: ");
                    for (i = 0; i < numEdges; i++) {
                        existingVertices[i] = sc.nextInt();
                    }

                    g.insertVertex(numEdges, existingVertices);
                    System.out.print("After inserting vertex the adjacency matrix is: \n");
                    g.print();
                    break;
                case 2:
                    System.out.print("Enter the source vertex of the edge: ");
                    source = sc.nextInt();
                    System.out.print("Enter the destination vertex of the edge: ");
                    destination = sc.nextInt();
                    g.insertEdge(source, destination);
                    System.out.print("After inserting edge the adjacency matrix is: \n");
                    g.print();
                    break;
                case 3:
                    int delVertex;
                    System.out.print("Enter the vertex to be deleted: ");
                    delVertex = sc.nextInt();
                    g.deleteVertex(delVertex);
                    System.out.print("After deleting vertex the adjacency matrix is: \n");
                    g.print();
                    break;
                case 4:
                    System.out.print("Enter the source vertex of the edge: ");
                    source = sc.nextInt();
                    System.out.print("Enter the destination vertex of the edge: ");
                    destination = sc.nextInt();
                    g.deleteEdge(source, destination);
                    System.out.print("After deleting edge the adjacency matrix is: \n");
                    g.print();
                    break;
                case 5:
                    g.print();
                    break;
                case 6:
                    return;
            }
        }
    }
}
