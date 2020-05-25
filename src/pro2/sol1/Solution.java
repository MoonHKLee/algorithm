package pro2.sol1;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,5};
        System.out.println(solution.solution(arr));
    }
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        answer = sum/arr.length;
        return answer;
    }
}
