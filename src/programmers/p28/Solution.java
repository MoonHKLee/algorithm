package programmers.p28;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Long> heap = setHeap(scoville);
        while (!isOverScoville(heap,K)) {
            PriorityQueue<Long> queue = addLowerScovilleTwoFood(heap);
            if(queue.size()==1 && queue.peek() < K){
                return -1;
            }
            answer++;
        }
        return answer;
    }

    public PriorityQueue<Long> setHeap(int[] scoville) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for (long i : scoville) {
            heap.offer(i);
        }
        return heap;
    }

    public PriorityQueue<Long> addLowerScovilleTwoFood(PriorityQueue<Long> heap) {
        long firstFood = heap.poll();
        long secondFood = heap.poll();
        heap.offer(firstFood + secondFood * 2);
        return heap;
    }

    public boolean isOverScoville(PriorityQueue<Long> heap, int k) {
        return heap.peek() >= k;
    }

}
