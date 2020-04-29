package b2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String [] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        //4방향 순서
        int [] x = {0,0,1,-1};
        int [] y = {1,-1,0,0};

        //input
        int [][] arr = new int [n+1][m+1];
        for (int i = 1; i <= n ; i++) {
            String input = br.readLine();
            for (int j = 1; j <=m ; j++) {
                arr[i][j] = Character.getNumericValue(input.charAt(j-1));
            }
        }

        //BSF를 위한 queue 생성
        Queue<Place> queue = new LinkedList<>();

        //bsf 하기







    }
    public static void bsf(){
        //1.좌표를 벗어나면 종료
        //2.벽위에 있게되면 종료
        //3.이미 갔던 곳이면 종료
        //4.좌표가 도착지점이면 현재까지의 거리를 출력하고 큐 전체 삭제 후 종료.
        //5.도착하면 해당 좌표를 큐에 넣고
        //6.좌표 위에 도착한 것을 표시하고
        //7.상하좌우로 퍼뜨린다.
    }
}

class Place {
    int x;
    int y;
    Place(int x, int y){
        this.x = x;
        this.y = y;
    }
}
