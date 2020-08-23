package baekjoon.b4963;

import java.io.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = 10000000;
                if(i==j){
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            String [] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0])-1;
            int y = Integer.parseInt(str[1])-1;
            arr[x][y] = Math.min(arr[x][y],Integer.parseInt(str[2]));
        }
        solution(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

    public static int [][] solution(int [][] graph){
        for(int k = 0; k < graph.length; k++) {
            // 출발하는 노드 i
            for(int i=0; i < graph.length; i++) {
                // 도착하는 노드 j
                for(int j=0; j < graph.length; j++) {
                    //i에서 k를 거쳤다가 k에서 j 까지 가는 거리와 i에서 j 까지 가는 거리를 비교해서 작은 값이 최소거리이다.
                    graph[i][j] = Math.min(graph[i][k] + graph[k][j], graph[i][j]);
                }
            }
        }
        for(int i=0; i < graph.length; i++) {
            for(int j=0; j < graph.length; j++) {
                if(graph[i][j]==10000000){
                    graph[i][j] = 0;
                }
            }
        }
        return graph;
    }
}
