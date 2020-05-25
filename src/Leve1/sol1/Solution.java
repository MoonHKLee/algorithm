package Leve1.sol1;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2015));
    }

    public int solution(int p) {
        p++;
        int answer;
        while (true){
            String num = Integer.toString(p);
            int [] arr = new int[10];
            for (int i = 0; i < num.length(); i++) {
                arr[Character.getNumericValue(num.charAt(i))]++;
            }
            int count = 0;
            for (int value : arr) {
                if (value >= 2) {
                    count++;
                }
            }
            if(count==0){
                answer = p;
                break;
            }
            p++;
        }

        return answer;
    }
}
