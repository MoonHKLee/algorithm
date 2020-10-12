package CodingTest.DevMatching.t02;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10, new int[][]{{1, 5}, {2, 7}, {4, 8}, {3, 6}}));
    }
    int answer;
    public int solution(int n, int[][] groups) {
        answer = Integer.MAX_VALUE;
        int[][] ints = Arrays.stream(groups).sorted((Comparator.comparingInt(o -> o[0]))).toArray(int[][]::new);
        int [] arr = new int[n+1];
        dfs(arr,ints,0);
        return answer;
    }

    private void dfs(int[] arr,int[][]groups,int index) {
        if(index==groups.length-1){
            return;
        }
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, copy.length);
        for (int i = groups[index][0]; i<= groups[index][1]; i++) {
            arr[i] = 1;
        }
        answer++;

        dfs(copy, groups, index+1);
        dfs(arr, groups, index+1);
    }
}
