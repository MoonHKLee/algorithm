package KaKao.k08;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    LinkedList<String> queue = new LinkedList<>();

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        for (String city : cities) {
            answer += getProcessTime(city.toLowerCase(),cacheSize);
        }
        return answer;
    }

    public int getProcessTime(String city, int cacheSize) {
        //큐에 있으면
        if(queue.contains(city)) {
            queue.remove(city);
            queue.offer(city);
            return 1;
        }
        //큐가 비어있으면
        if (queue.size() < cacheSize) {
            queue.offer(city);
            return 5;
        }
        //큐가 가득 차있으면
        queue.removeFirst();
        queue.offer(city);
        return 5;
    }
}
