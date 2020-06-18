package programmers.p03;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

    }

    public int solution(int n, int[] lost, int[] reserve) {
        int [] totalClothes = new int [n];
        for (int i = 0; i < n; i++) {
            totalClothes[i]=1;
        }
        for (int i : lost) {
            totalClothes[i]--;
        }
        for (int i : reserve) {
            totalClothes[i]++;
        }

        if(totalClothes[0]==0){
            if (totalClothes[1]==2){
                totalClothes[0]++;
                totalClothes[1]--;
            }
        }

        for (int i = 1; i < n-1; i++) {
            if(totalClothes[i]==0){
                if (totalClothes[i-1]+totalClothes[i+1]==3){

                }

            }
        }

        int answer = 0;
        return answer;
    }
}
