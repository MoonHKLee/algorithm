package programmers.p11;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));

    }
    public int solution(int n){
        int [] arr = new int[n+1];
        List<Integer> answer = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i]!=0){
                answer.add(i);
            }
            for (int j = i; j <= n; j+=i) {
                arr[j]=0;
            }
        }
        return answer.size();
    }
}
