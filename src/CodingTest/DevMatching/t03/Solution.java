package CodingTest.DevMatching.t03;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{
                "AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL", "AVANT", "SANTA"
        }, 2));
    }

    public String solution(String[] votes, int k) {
        int top = 0;
        int bottom = 0;
        String answer = "";
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String vote : votes) {
            map.put(vote,map.getOrDefault(vote,0)+1);
        }
        Map<String, Integer> result = sortMapByKey(map);
        Map<String, Integer> result2 = sortMapByValue(result);
        LinkedList<Data> list = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : result2.entrySet()) {
            list.add(new Data(entry.getKey(),entry.getValue()));
        }
        for (int i = 0; i < k; i++) {
            top+=list.get(i).number;
        }
        while(true){
            if(top>bottom+list.getLast().number){
                bottom += list.getLast().number;
                answer = list.getLast().name;
            }else{
                return answer;
            }
            list.removeLast();
        }
    }

    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static LinkedHashMap<String, Integer> sortMapByKey(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByKey());

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
class Data {
    String name;
    int number;

    public Data(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
