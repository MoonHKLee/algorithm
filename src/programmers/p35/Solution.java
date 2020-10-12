package programmers.p35;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{3, 0, 6, 1, 5}));
        String[] strings = new String[10];
    }

    public int solution(int[] citations) {
        int h = 0;
        Integer[] arr = Arrays.stream(citations).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=i+1) {
                h = i + 1;
            }
        }
        return h;
    }
}
