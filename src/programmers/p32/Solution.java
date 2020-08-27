package programmers.p32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(10, 2)));
        System.out.println(Arrays.toString(solution.solution(8, 1)));
        System.out.println(Arrays.toString(solution.solution(24, 24)));
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<int[]> yellows = getYellowXY(yellow);

        for (int[] ints : yellows) {
            if(getBrownTile(ints[0],ints[1]) == brown){
                return new int[]{ints[1]+2,ints[0]+2};
            }
        }
        return answer;
    }

    public List<int[]> getYellowXY(int yellow) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                list.add(i);
            }
        }

        List<int[]> answer = new ArrayList<>();
        if(list.size() % 2 == 0){
            for (int i = 0; i < list.size()/2; i++) {
                answer.add(new int[]{list.get(i),list.get(list.size()-i-1)});
            }
        }else{
            for (int i = 0; i < list.size()/2+1; i++) {
                answer.add(new int[]{list.get(i),list.get(list.size()-i-1)});
            }
        }

        return answer;
    }

    public int getBrownTile(int x, int y) {
        return (2 * (x+2)) + (2 * y);
    }
}
