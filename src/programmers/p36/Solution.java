package programmers.p36;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(solution.solution(new int[]{70, 80, 50}, 100));
    }
    public int solution(int[] people, int limit) {
        int answer = 0;
        LinkedList<Integer> list = new LinkedList<>();
        people = Arrays.stream(people).sorted().toArray();
        for (int person : people) {
            list.add(person);
        }
        while(!list.isEmpty()) {
            if(list.size()==1) {
                list.removeFirst();
                answer++;
                break;
            }
            if(list.getFirst()+list.getLast()<=limit) {
                list.removeFirst();
                list.removeLast();
                answer++;
            }else {
                list.removeLast();
                answer++;
            }
        }

        return answer;
    }
}
