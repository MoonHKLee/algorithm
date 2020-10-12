package CodingTest.Coupang.t03;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(10)));//6,4
        System.out.println(Arrays.toString(solution.solution(14)));//5,8
        System.out.println(Arrays.toString(solution.solution(950079)));//5,8
    }
    public int[] solution(int N) {
        int[] answer = new int[2];
        for (int i = 2; i <= 10; i++) {
            int result = getMax(i,N);
            if(result>=answer[1]){
                answer[0] = i;
                answer[1] = result;
            }
        }
        return answer;
    }

    public int getMax(int grade, int N) {
        int result = 1;
        do {
            int tmp = N % grade;
            if (tmp != 0) {
                result *= tmp;
            }
            N /= grade;
        } while (N != 0);
        return result;
    }
}
