package CodingTest.Winter.t03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}, {2, 2, 2, 1}, {0, 0, 0, 2}})));
        System.out.println(Arrays.toString(solution.solution(new int[][]{{0, 0, 1}, {2, 2, 1}, {0,0,0}})));
    }
    static int[] moveX = {-1,1,0,0};
    static int[] moveY = {0,0,-1,1};
    static Queue<Place> queue = new LinkedList<>();

    public int[] solution(int[][] v){
        int n = v.length;
        int[] answer = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(v[i][j] != '3') {
                    if(v[i][j]==0) {
                        queue.offer(new Place(i,j));
                        bfs1(v,v[i][j]);
                        answer[0]++;
                    }
                    if(v[i][j]==1) {
                        queue.offer(new Place(i,j));
                        bfs1(v,v[i][j]);
                        answer[1]++;
                    }
                    if(v[i][j]==2) {
                        queue.offer(new Place(i,j));
                        bfs1(v,v[i][j]);
                        answer[2]++;
                    }
                }
            }
        }
        return answer;
    }

    public static void bfs1 (int[][] arr, int number) {
        while(!queue.isEmpty()) {
            Place poll = queue.poll();
            if(poll.x < 0 || poll.x >= arr.length || poll.y < 0 || poll.y >= arr.length) {
                continue;
            }
            if(arr[poll.x][poll.y] == '0') {
                continue;
            }
            if(arr[poll.x][poll.y] != number) {
                continue;
            }
            arr[poll.x][poll.y] = '0';
            for (int i = 0; i < 4; i++) {
                queue.offer(new Place(poll.x+moveX[i],poll.y+ moveY[i]));
            }
        }
    }
}

class Place {
    int x;
    int y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Place{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
