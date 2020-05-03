package b2667;

import java.io.*;
import java.util.*;

import static java.lang.System.in;

public class Main {
    static int [][] arr;
    static int [] moveX={-1,1,0,0};
    static int [] moveY={0,0,-1,1};
    static Queue<Place> queue;
    static int n;
    static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        n = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        for (int i = 1; i <=n ; i++) {
            String str = br.readLine();
            for (int j = 1; j <=n ; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j-1));
            }
        }

        queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(arr[i][j]==1){
                    bfs(i,j);
                    count++;
                }
            }
        }
        bw.write(count+"\n");
        int [] ans = answer.stream().sorted().mapToInt(v->(int)v).toArray();
        for (int i = 0; i < answer.size(); i++) {
            bw.write(ans[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs(int x, int y){
        int count = 0;
        Place place = new Place(x,y);
        queue.offer(place);
        while(!queue.isEmpty()){
            place = queue.poll();
            if(place.x<0||place.y<0||place.x>n||place.y>n){
                continue;
            }
            if(arr[place.x][place.y]==0){
                continue;
            }
            arr[place.x][place.y]=0;
            count++;
            for (int i = 0; i <4 ; i++) {
                queue.offer(new Place(place.x+moveX[i],place.y+moveY[i]));
            }
        }
        answer.add(count);
    }
}
class Place {
    int x;
    int y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
