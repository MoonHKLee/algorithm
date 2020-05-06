package b1697;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<Place> queue;
    static int x;
    static int y;
    static BufferedReader br;
    static BufferedWriter bw;
    static boolean [] visited = new boolean[100001];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);

        queue = new LinkedList<>();
        queue.offer(new Place(x,0));
        visited[0]=true;
        dfs();

    }
    public static void dfs() throws IOException{
        while(!queue.isEmpty()){
            Place place = queue.poll();
            if(place.x < 0 || place.x>100000){
                continue;
            }
            if(place.x == y){
                bw.write(""+place.count);
                queue.remove();
                bw.flush();
                bw.close();
                break;
            }
            //분산로직
            if(place.x-1>=0 && !visited[place.x-1]) {
                queue.offer(new Place(place.x + 1, place.count + 1));
                visited[place.x] = true;
            }
            if(place.x+1<=100000 && !visited[place.x+1]) {
                queue.offer(new Place(place.x - 1, place.count + 1));
                visited[place.x] = true;
            }
            if(place.x * 2<=100000 && !visited[place.x*2]) {
                queue.offer(new Place(place.x * 2, place.count + 1));
                visited[place.x] = true;

            }
        }
    }
}

class Place{
    int x;
    int count;

    public Place(int x, int count) {
        this.x = x;
        this.count = count;
    }
}
