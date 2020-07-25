package programmers.p20;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            list.add(getTimeOfPriceStay(i,prices));
        }
        int[] answer = list.stream().mapToInt(v -> v).toArray();
        return answer;
    }
    public int getTimeOfPriceStay(int index, int[] prices){
        int start = prices[index];
        int time = 0;
        for(int i = index ; i < prices.length-1 ; i++){
            time++;
            if( start <= prices[i+1]){
                break;
            }
        }
        return time;
    }
}