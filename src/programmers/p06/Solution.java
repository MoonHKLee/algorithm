package programmers.p06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1,1,3,3,0,1,1});
    }
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int value : arr) {
            if (list.get(list.size() - 1) != value) {
                list.add(value);
            }
        }
        int[] answer = list.stream().mapToInt(v -> v).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
