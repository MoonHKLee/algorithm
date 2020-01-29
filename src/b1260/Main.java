package b1260;

import java.util.*;

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
        graph.dfs(start);
        graph.clear();
        System.out.println();
        graph.bfs(start);
    }

    static class Graph {
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
}

