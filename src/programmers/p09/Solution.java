package programmers.p09;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String answer = "";
        Character [] arr = new Character[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (char c : arr) {
            answer = answer.concat(Character.toString(c));
        }
        return answer;
    }
}
