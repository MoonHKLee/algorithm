package programmers.p16;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1,1,9,1,1,1},0);
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Data> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0 ; i < priorities.length; i++) {
            queue.offer(new Data(i,priorities[i]));
        }
        int count = 0;
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            if(queue.poll().location==location){
                answer=count;
            }
            count++;

        }
        return answer+1;
    }
}

class Data implements Comparable<Data>{

    int location;
    int priority;

    Data(int location, int priority){
        this.location = location;
        this.priority = priority;
    }

    @Override
    public int compareTo(Data o) {
        return this.priority > o.priority ? 1 : - 1;
    }

    @Override
    public String toString() {
        return "Data{" +
                "location=" + location +
                ", priority=" + priority +
                '}';
    }
}