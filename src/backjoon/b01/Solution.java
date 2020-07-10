package backjoon.b01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int [][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        List<Place> homeList = new ArrayList<>();
        List<Place> chickenList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == 1){
                    homeList.add(new Place(i,j));
                }
                if(arr[i][j] == 2){
                    chickenList.add(new Place(i,j));
                }
            }
        }


        //when


        //then


    }
    public static List<Place> getComb(List<Place> chickenList, List<Place> get3, int m, int floor){
        if(get3.size()>=m){
            return get3;
        }
        getComb(chickenList,get3,m,floor);
        get3.add(chickenList.get(floor));
        getComb(chickenList,get3,m,floor+1);

        return get3;
    }


}

class Place{
    int x;
    int y;
    Place(int x, int y){
        this.x = x;
        this.y = y;
    }
}
