package programmers.p15;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                list.add(i);
            }
        }
        for (Integer integer : list) {
            answer += integer;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
