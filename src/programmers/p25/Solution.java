package programmers.p25;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Data> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Data(priorities[i], i));
        }

        while (!queue.isEmpty()) {
            if(queue.peek().priority < getMax(queue)){
                moveFirstToLast(queue);
            }else{
                answer++;
                if(queue.poll().location==location){
                    return answer;
                }

            }
        }

        return answer;
    }

    public Data print(LinkedList<Data> queue) {
        return queue.poll();
    }

    private int getMax(LinkedList<Data> queue) {
        int priority = queue.peek().priority;
        for (Data data : queue) {
            int nowPriority = data.priority;
            if(nowPriority > priority) {
                priority = nowPriority;
            }
        }
        return priority;
    }

    public LinkedList<Data> moveFirstToLast(LinkedList<Data> queue) {
        queue.offer(queue.poll());
        return queue;
    }
}

class Data {
    int priority;
    int location;

    public Data(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}
