package Naver.h1;

import java.util.Arrays;

public class Solution {
    public String solution (int n, int [][] delivery){
        //1=o, 0=x, -1=?
        int [] answer = new int[n+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=-1;
        }
        StringBuilder str= new StringBuilder();

        //logic 1
        Arrays.stream(delivery)
                .forEach(v->{
                    if (v[2]==1){
                        answer[v[0]]=1;
                        answer[v[1]]=1;
                    }
                });

        //logic 2
        Arrays.stream(delivery)
                .forEach(v->{
                    if (answer[v[0]]==1 && answer[v[1]]==-1 &&v[2]==0){
                        answer[v[1]]=0;
                    }
                    if (answer[v[0]]==-1 && answer[v[1]]==1 &&v[2]==0){
                        answer[v[0]]=0;
                    }
                });

        //logic 3
        for (int i = 1; i < answer.length; i++) {
            if (answer[i] == 0) {
                str.append("X");
            } else if (answer[i] == 1) {
                str.append("O");
            } else {
                str.append("?");
            }
        }

        return str.toString();
    }
}
