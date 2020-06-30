package programmers.p07;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(v->v%divisor==0).sorted().toArray();
        if(answer.length == 0){
            return new int[]{-1};
        }
        return answer;
    }
}
