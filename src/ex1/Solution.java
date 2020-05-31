package ex1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String [] participant1 = {"leo","kiki","eden"};
        String [] completion1 = {"eden", "kiki"};
        String [] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String [] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String [] completion3 = {"stanko", "ana", "mislav"};
        Solution solution = new Solution();
        System.out.print(solution.solution(participant3,completion3));
    }
    public String solution(String [] participant, String [] completion){
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for (String s:participant){
            //getOrDefault 라는 기능을 사용하면 더우 좋다.
            if(map.containsKey(s)){
                Integer number = map.get(s);
                number++;
                map.put(s,number);
            }
            else{
                map.put(s,1);
            }
        }
        for (String s : completion) {
            Integer number = map.get(s);
            number--;
            map.put(s, number);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
