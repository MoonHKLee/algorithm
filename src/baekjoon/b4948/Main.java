package baekjoon.b4948;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.in;

public class Main {
    static int [][] arr;
    static Queue<Place> queue = new LinkedList<>();
    static int [] moveX={-1,1,0,0};
    static int [] moveY={0,0,-1,1};
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] str = br.readLine().split(" ");
        m = Integer.parseInt(str[0]);
        n = Integer.parseInt(str[1]);
        arr = new int[n+1][m+1];
        int answer = 0;
        for (int i = 1; i <=n ; i++) {
            str = br.readLine().split(" ");
            for (int j = 1; j <=m ; j++) {
                arr[i][j] = Integer.parseInt(str[j-1]);
            }
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(arr[i][j]==1){
                    queue.offer(new Place(i,j,0));
                }
            }
        }
        answer = bfs();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(arr[i][j]==0){
                    answer = -1;
                    break;
                }
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        System.out.println();
        System.out.println((runtime.totalMemory()-runtime.freeMemory())/1024*1024);
        bw.close();

    }
    public static int bfs(){
        int count = 0;
        while(!queue.isEmpty()){
            Place place = queue.poll();
            if(place.x<1 || place.x>n || place.y<1 ||place.y>m){
                continue;
            }
            if(arr[place.x][place.y]==-1){
                continue;
            }
            if (arr[place.x][place.y]==0){
                arr[place.x][place.y] = 1;
            }
            count = Math.max(count,place.count);
            if(arr[place.x][place.y]==1){
                for (int i = 0; i < 4; i++) {
                    if(place.y+moveY[i]<=m && place.x+moveX[i]<=n && arr[place.x+moveX[i]][place.y+moveY[i]]==0) {
                        queue.offer(new Place(place.x + moveX[i], place.y + moveY[i], place.count + 1));
                    }
                }
            }
        }
        return count;
    }
}

class Place{
    int x;
    int y;
    int count;
    Place(int x, int y,int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
