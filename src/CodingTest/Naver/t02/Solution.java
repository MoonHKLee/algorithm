package CodingTest.Naver.t02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[][]{new int[]{0, 50}, new int[]{0, 22}, new int[]{2, 10}, new int[]{1, 4}, new int[]{4, -13}})));
    }

    public int[] solution(int[][] blocks){
        int[][] answer = new int[blocks.length][blocks.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks.length; j++) {
                answer[i][j] = 101;
            }
        }
        for (int i = 0; i < blocks.length; i++) {
            answer[i][blocks[i][0]] = blocks[i][1];
        }
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if(answer[i][j] != 101) {
                    for (int k = j; k >0 ; k--) {
                        answer[i][k-1] = answer[i-1][k-1] - answer[i][k];
                    }
                    for (int k = j; k < i ; k++) {
                        answer[i][k+1] = answer[i-1][k] - answer[i][k];
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < i+1; j++) {
                list.add(answer[i][j]);
            }
        }
        return list.stream().mapToInt(v->v).toArray();
    }
}
