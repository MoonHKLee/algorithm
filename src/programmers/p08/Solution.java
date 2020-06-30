package programmers.p08;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        return Arrays.stream(strings).sorted().sorted(Comparator.comparing(v->v.charAt(n))).toArray(String[]::new);
    }
}
