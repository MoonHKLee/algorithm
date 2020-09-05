package KaKao.k02;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] result = new int[n];
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] | arr2[i];
        }

        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder(setBinary(result[i], n));
            for (int j = 0; j < n; j++) {
                if(builder.charAt(j)=='0'){
                    builder.replace(j,j+1," ");
                }else {
                    builder.replace(j,j+1,"#");
                }
            }
            answer[i] = builder.toString();
        }
        return answer;
    }
    public String setBinary(int number, int length) {
        String result = Integer.toBinaryString(number);
        StringBuilder builder = new StringBuilder(result);
        if (result.length() < length) {
            int n = length - result.length();
            for (int i = 0; i < n; i++) {
                builder.insert(i,0);
            }
        }
        return builder.toString();
    }
}
