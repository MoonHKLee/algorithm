package programmers.p17;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.Collectors;

public class Solution {
    Queue<Truck> queue = new LinkedList<>();
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        System.out.println(solution.solution(2,10 , new int[]{7,4,5,6}));
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for (int truck_weight : truck_weights) {
            list.add(truck_weight);
        }
        int answer = 0;
        while(true){
            if(!list.isEmpty()) {
                while (!canOnBridge(queue, list.get(0), weight)) {
                    queue = queue.stream()
                            .map(v -> new Truck(v.weight, v.position + 1))
                            .collect(Collectors.toCollection(LinkedTransferQueue::new));
                    answer++;
                    if (queue.peek().position >= bridge_length) {
                        queue.poll();
                    }
                }
                queue.offer(new Truck(list.get(0), 0));
                list.remove(0);
            }
            queue = queue.stream()
                    .map(v -> new Truck(v.weight, v.position + 1))
                    .collect(Collectors.toCollection(LinkedTransferQueue::new));
            answer++;
            if (queue.peek().position >= bridge_length) {
                queue.poll();
            }
            if(list.isEmpty() && queue.isEmpty()){
                break;
            }
        }
        return answer+1;
    }
    //이번 트럭이 현재 차례에 다리에 올라가면 무게가 초과하는지
    public boolean canOnBridge (Queue<Truck> queue, int truck, int weight){
        int sum = 0;
        for (int i = 0; i < queue.size(); i++) {
            sum += queue.stream().mapToInt(v -> v.weight).sum();
        }
        return sum + truck <= weight;
    }
}
class Truck {
    int weight;
    int position;
    Truck(int weight, int position){
        this.weight = weight;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", position=" + position +
                '}';
    }
}
