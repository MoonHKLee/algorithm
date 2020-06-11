package programmers.p01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static List<String> use = new ArrayList<>();
    static int[] turn;
    public static void main(String[] args) {
        String [] str = {"tank","kick","know","wheel", "land", "dream", "mother", "robot", "tank"};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(3, str)));
    }
    public int[] solution(int n, String [] words){
        turn = new int[n];
        int[] answer = {0,0};
        String end ="";
        use.add(words[0]);
        end = Character.toString(words[0].charAt(words[0].length()-1));

        turn[0]++;
        for (int i = 1; i < words.length; i++) {
            if(use.contains(words[i]) || !Character.toString(words[i].charAt(0)).equals(end)){
                answer[0] = (i%n)+1;
                answer[1] = turn[i%n]+1;
                break;
            }else{
                use.add(words[i]);
                end = Character.toString(words[i].charAt(words[i].length()-1));
                turn[i%n]++;
            }
        }
        return answer;
    }
}
