package b1260;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int vertex;//정점의 갯수
    private int [][] arr;//입력값을 바탕으로 만들어낸 배열
    private List<Integer> adj;

    public Graph(int vertex) {
        this.vertex = vertex;
        arr = new int[this.vertex+1][this.vertex+1];//배열 생성
        adj = new ArrayList<Integer>();
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

    public void dfs (int start){
        adj.add(start);
        System.out.print(start+" ");
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][start] == 1 && !adj.contains(i)){
                dfs(i);
            }
        }
    }
}
