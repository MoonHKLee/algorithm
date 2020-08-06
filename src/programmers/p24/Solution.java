package programmers.p24;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {
        Solution solution =  new Solution();
        System.out.println(solution.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i < skill_trees.length; i++) {
            Queue<Character> queue1 = castToQueue(skill);
            Queue<Character> queue2 = castToQueue(skill_trees[i]);
            answer += isPossible(queue1,queue2);
        }
        return answer;
    }

    public Queue<Character> castToQueue(String skill) {
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < skill.length(); i++) {
            queue.add(skill.charAt(i));
        }
        return queue;
    }

    public int isPossible(Queue<Character> queue1, Queue<Character> queue2) {
        while(!queue2.isEmpty()) {
            if(isIncludedInTrees(queue1,queue2)) {
                if(queue1.peek().equals(queue2.peek())) {
                    queue1.poll();
                    queue2.poll();
                }else{
                    return 0;
                }
            }else{
                queue2.poll();
            }
        }
        return 1;
    }

    public boolean isIncludedInTrees(Queue<Character> queue1, Queue<Character> queue2) {
        if(queue1.contains(queue2.peek())){
            return true;
        }
        return false;
    }
}
