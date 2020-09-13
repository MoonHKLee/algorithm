package Line.t02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{6, 2, 5, 1, 4, 3})));
        System.out.println(Arrays.toString(solution.solution(new int[]{11,2,9,13,24}, new int[]{9,2,13,24,11})));
    }

    public int[] solution(int[] ball, int[] order) {
        LinkedList<Ball> list = new LinkedList<>();
        List<Integer> answers = new ArrayList<>();
        for (int i : ball) {
            list.add(new Ball(i));
        }
        int i = 0;
        while(!list.isEmpty()) {
            if (list.getFirst().check){
                answers.add(list.getFirst().number);
                list.removeFirst();
                continue;
            }
            if (list.getLast().check){
                answers.add(list.getLast().number);
                list.removeLast();
                continue;
            }
            if(list.getFirst().number==order[i]){
                answers.add(list.getFirst().number);
                list.removeFirst();
                i++;
                continue;
            }
            if(list.getLast().number==order[i]){
                answers.add(list.getLast().number);
                list.removeLast();
                i++;
                continue;
            }
            checkIndex(list,order[i]);
            i++;
        }
        return answers.stream().mapToInt(v->v).toArray();
    }

    public void checkIndex(LinkedList<Ball> balls, int number) {
        for (Ball ball : balls) {
            if (ball.number == number) {
                ball.check = true;
            }
        }
    }
}

class Ball {
    int number;
    boolean check;

    public Ball(int number) {
        this.number = number;
        this.check = false;
    }
}
