package b1260;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertex = scan.nextInt();
        int edge = scan.nextInt();
        int start = scan.nextInt();

        int vertex1;
        int vertex2;
        Graph graph = new Graph(vertex);
        for (int i = 0; i < edge; i++) {
            vertex1 = scan.nextInt();
            vertex2 = scan.nextInt();
            graph.setVertex(vertex1,vertex2);
        }
//        graph.printAll();
        graph.dfs(start);

    }
}
