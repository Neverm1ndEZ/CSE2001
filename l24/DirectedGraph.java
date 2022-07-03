package l24;

import java.util.*;

public class DirectedGraph {
    private int numVertices;
    private int numEdges;
    private int[][] adjMatrix;

    public DirectedGraph(int v, int e) {
        this.numVertices = v;
        this.numEdges = e;
        adjMatrix = new int[2 * numVertices][2 * numVertices];

    }

    void print() {
        if (numVertices == 0) {
            System.out.println("Graph is empty");
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

    void insertVertex(int numIncomingEdges, int numOutgoingEdges, int incoming[], int outgoing[]) {
        /* Write the required functionality via going through pseudo code given */
        int i = 0;
        numVertices++;
        for (i = 0; i < numVertices; i++) {
            adjMatrix[i][numVertices - 1] = 0;
            adjMatrix[numVertices - 1][i] = 0;
        }

        for (i = 0; i < numIncomingEdges; i++) {
            if (incoming[i] < numVertices) {
                adjMatrix[incoming[i]][numVertices - 1] = 1;
            } else {
                System.out.println("Invalid vertex");
            }
        }

        for (i = 0; i < numOutgoingEdges; i++) {
            if (outgoing[i] < numVertices) {
                adjMatrix[numVertices - 1][outgoing[i]] = 1;
            } else {
                System.out.println("Invalid vertex");
            }
        }
    }

    void insertEdge(int source, int destination) {
        /* Write the required functionality via going through pseudo code given */
        if (source < numVertices && destination < numVertices && source > -1 && destination > -1) {
            if (adjMatrix[source][destination] == 1) {
                System.out.println("Edge already exists");
                return;
            }
            adjMatrix[source][destination] = 1;
        } else {
            System.out.println("Invalid vertex");
            return;
        }
    }

    void deleteVertex(int delVertex) {
        /* Write the required functionality via going through pseudo code given */
        if (numVertices == 0) {
            System.out.println("Invalid vertex");
            return;
        }

        int j = delVertex;
        for (int i = j; i < numVertices - 1; i++) {
            for (int k = 0; k < numVertices; i++) {
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
        /* Write the required functionality via going through pseudo code given */
        if (source < numVertices && destination < numVertices && source > -1 && destination > -1) {
            if (adjMatrix[source][destination] == 0) {
                System.out.println("Edge does not exist");
                return;
            }
            adjMatrix[source][destination] = 0;
        } else {
            System.out.println("Invalid vertex");
        }
    }

    public static void main(String[] args) {
        int source, destination, i, j, op;
        int v, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices (The verticies will be numbered 0,1,2 and so on): ");
        v = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        e = sc.nextInt();
        DirectedGraph g = new DirectedGraph(v, e);
        for (i = 1; i <= e; i++) {
            System.out.print("Enter source: ");
            source = sc.nextInt();
            System.out.print("Enter destination: ");
            destination = sc.nextInt();
            ;
            if (source >= v || destination >= v || source < 0 || destination < 0) {
                System.out.print("Invalid index. Try again.\n");
                i--;
                continue;
            } else {
                g.insertEdge(source, destination);
            }
        }
        while (true) {
            System.out.print("1.Insert vertex 2.Insert edge 3.Delete vertex 4.Delete edge 5.Print adjacency matrix 6.Exit\n");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    int incoming[];
                    int outgoing[];
                    incoming = new int[v];
                    outgoing = new int[v];
                    int numIncomingEdges;
                    int numOutgoingEdges;
                    System.out.print("Enter the number edges from the existing vertices to new vertex: ");
                    numIncomingEdges = sc.nextInt();
                    System.out.print("Enter the source of each edge: ");
                    for (i = 0; i < numIncomingEdges; i++) {
                        incoming[i] = sc.nextInt();
                    }
                    System.out.print("Enter the number edges from the new vertex to existing vertices: ");
                    numOutgoingEdges = sc.nextInt();
                    System.out.print("Enter the destination of each edge: ");
                    for (i = 0; i < numOutgoingEdges; i++) {
                        outgoing[i] = sc.nextInt();
                    }
                    g.insertVertex(numIncomingEdges, numOutgoingEdges, incoming, outgoing);
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