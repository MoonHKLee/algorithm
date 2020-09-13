package Line.t01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][]{{1, 2}, {2, 1}, {3, 3}, {4, 5}, {5, 6}, {7, 8}}));
        System.out.println(solution.solution(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
        System.out.println(solution.solution(new int[][]{{1, 2}, {2, 3}, {3, 1}}));
    }

    public int solution(int[][] boxes) {
        int size = boxes.length;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int[] box : boxes) {
            for (int i : box) {
                list.add(i);
            }
        }
        list = list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).equals(list.get(i + 1))) {
                count++;
                i++;
            }
        }
        return size-count;
    }

}
