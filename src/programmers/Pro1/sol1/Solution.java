package programmers.Pro1.sol1;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Zbcdefg"));
    }
    public String solution(String s) {
        String answer = "";
        String [] str = s.split("");
        Arrays.sort(str);
        Collections.reverse(Arrays.asList(str));
        answer = String.join("",str);
        return answer;
    }
}
