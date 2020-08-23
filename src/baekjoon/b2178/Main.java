package baekjoon.b2178;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n = 0;
    static int m = 0;
    static int [][] arr;
    static int [][] arr2;
    static Queue<Place> queue;
    //4방향 순서
    static int [] moveX = {0,0,1,-1};
    static int [] moveY = {1,-1,0,0};
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String [] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        //input
        arr = new int [n+1][m+1];
        arr2 = new int [n+1][m+1];
        for (int i = 1; i <= n ; i++) {
            String input = br.readLine();
            for (int j = 1; j <=m ; j++) {
                final int numericValue = Character.getNumericValue(input.charAt(j - 1));
                arr[i][j] = numericValue;
                arr2[i][j] = numericValue;
            }
        }

        //BSF를 위한 queue 생성
        queue = new LinkedList<>();

        //bsf 하기
        Place place = new Place(1,1,0);
        bsf(place.x,place.y,0);


    }
    public static void bsf(int x, int y,int count) throws IOException {
        queue.offer(new Place(x,y,count));
        //상하좌우로 퍼뜨린다.
        while(!queue.isEmpty()){
            Place place = queue.poll();
            //1.좌표를 벗어나면 종료
            if(place.x<0 || place.y<0 || place.x>n || place.y>m){
                continue;
            }

            //2.벽위에 있게되거나 이미 갔던 곳이면 종료
            if(arr2[place.x][place.y]==0){
                continue;
            }

            //3.좌표가 도착지점이면 현재까지의 거리를 출력하고 큐 전체 삭제 후 종료.
            if(place.x==n && place.y==m){
                place.count++;
                bw.write(""+place.count);
                bw.flush();
                bw.close();
                queue=null;
                return;
            }
            //4.좌표 위에 도착한 것을 표시하고
            arr2[place.x][place.y] = 0;
            place.count++;
            for (int i = 0; i < 4; i++) {
                //5.도착하면 해당 좌표를 큐에 넣는다.
                queue.offer(new Place(place.x+moveX[i],place.y+moveY[i],place.count));
            }
        }
    }
}

class Place {
    int x;
    int y;
    int count;
    Place(int x, int y,int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
