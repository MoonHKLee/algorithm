package baekjoon.b9205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.System.in;

public class Main {
    int [][] arr;
    Queue<Place> queue = new LinkedList<>();
    int [] moveX = {-1,1,0,0};
    int [] moveY = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        List<Place> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String [] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            list.add(new Place(x,y));
            for (int j = 0; j < m; j++) {
                str = br.readLine().split(" ");
                x = Integer.parseInt(str[0]);
                y = Integer.parseInt(str[1]);
                list.add(new Place(x,y));
            }
            str = br.readLine().split(" ");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            list.add(new Place(x,y));
            solution.solution(list);
        }
    }

}

class Solution {
    public String solution(List<Place> list){

        return "happy";
    }

    public int getDistance(int x, int y){
        return 1;
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
