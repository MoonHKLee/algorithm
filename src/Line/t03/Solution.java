package Line.t03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(73425)));
        System.out.println(Arrays.toString(solution.solution(10007)));
        System.out.println(Arrays.toString(solution.solution(9)));
    }
    int[] answer;

    public int[] solution(int n) {
        answer = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
        getResult(n, 0);
        return answer;
    }

    public void getResult(int n, int count) {
        String number = Integer.toString(n);
        List<Integer> numbers = new ArrayList<>();
        if(n<10){
            if(count < answer[0]){
                answer[0] = count;
                answer[1] = n;
            }
        }
        for (int i = 1; i < number.length(); i++) {
            if(number.substring(i).charAt(0)=='0'){
                continue;
            }
            numbers.add(Integer.parseInt(number.substring(0,i))+Integer.parseInt(number.substring(i)));
        }
        for (int i : numbers) {
            getResult(i,count+1);
        }
    }
}
