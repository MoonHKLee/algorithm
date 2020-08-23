package baekjoon.b1260;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private int vertex;//정점의 갯수
    private int [][] arr;//입력값을 바탕으로 만들어낸 배열
    private List<Integer> adj;
    Queue<Integer> queue;

    public Graph(int vertex) {
        this.vertex = vertex;
        arr = new int[this.vertex+1][this.vertex+1];//배열 생성
        adj = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public int[][] setVertex(int vertex1,int vertex2){
        arr[vertex1][vertex2] = 1;
        arr[vertex2][vertex1] = 1;
        return arr;
    }

    public void printAll(){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void clear () {
        adj.clear();
        queue.clear();
    }

    public void dfs (int start){
        adj.add(start);
        System.out.print(start+" ");
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][start] == 1 && !adj.contains(i)){
                dfs(i);
            }
        }
    }

    public void bfs (int start){
        adj.add(start);
        if(queue.isEmpty()) {
            queue.offer(start);
        }
        for (int i = 1; i < arr.length ; i++) {
            if(arr[start][i] == 1 && !adj.contains(i) && !queue.contains(i)){
                queue.offer(i);
            }
        }
        System.out.print(queue.peek()+" ");
        queue.poll();
        if(!queue.isEmpty()){
            bfs(queue.peek());
        }
    }
}
