package CodingTest.ESTSoft.EST;

import java.util.Arrays;

public class Solution {
    public int solution(int [] A){
        int[] test = Arrays.stream(A).distinct().toArray();
        int answer = 0;
        for (int x:test){
            int result = (int) Arrays.stream(A).filter(v -> v==x).count();
            if(result==x && result>answer){
                answer=x;
            }
        }
        return answer;
    }
}
