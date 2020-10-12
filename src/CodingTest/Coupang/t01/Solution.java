package CodingTest.Coupang.t01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, new int[]{24,22,20,10,5,3,2,1}));
        System.out.println(solution.solution(2, new int[]{1300000000,700000000,668239490,618239490,568239490,568239486,518239486,157658638,157658634,100000000,100}));
    }

    public int solution(int k, int[] score) {
        int answer = 0;
        int[] difference = new int[score.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i < score.length; i++) {
            difference[i] = score[i] - score[i-1];
        }
        for (int j : difference) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value >= k){
                for (int i = 1; i < difference.length; i++) {
                    if(difference[i]==key){
                        score[i] = -1;
                        score[i-1] = -1;
                    }
                }
            }
        }
        for (int i : score) {
            if(i!=-1) {
                answer++;
            }
        }
        return answer;
    }

}
