package KaKao.t02;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})));
        System.out.println(Arrays.toString(solution.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(solution.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4})));
    }

    public String[] solution(String[] orders, int[] course) {
        List<String> answers = new ArrayList<>();
        for (int i : course) {
            Map<String,Integer> map = new HashMap<>();
            for (String order : orders) {
                for (String s : getCombString(order, i)) {
                    s = sort(s);
                    if(map.containsKey(s)){
                        int count = map.get(s);
                        count++;
                        map.put(s,count);
                    }else{
                        map.put(s,1);
                    }
                }
            }
            Integer max = 0;
            if(!map.isEmpty()){
                max = getMax(map);
            }
            if(max >=2) {
                List<String> listOfMax = getList(map, max);
                answers.addAll(listOfMax);
            }
        }
        answers.sort(String::compareTo);
        return answers.toArray(String[]::new);
    }

    public String sort(String str){
        String[] array = str.split("");
        Arrays.sort(array);
        return String.join("", array);
    }

    private List<String> getList(Map<String, Integer> map, Integer max) {
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(max))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private Integer getMax(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get()
                .getValue();
    }

    public String[] getCombString(String order, int check) {
        int n = order.length();
        char[] arr = order.toCharArray();
        boolean[] visited = new boolean[n];
        List<String> answer = new ArrayList<>();
        combination(arr, visited, 0, n, check, answer);
        return answer.toArray(String[]::new);
    }

    static void combination(char[] arr, boolean[] visited, int start, int n, int r, List<String> answer) {
        if (r == 0) {
            combPrint(arr, visited, n, answer);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, answer);
            visited[i] = false;
        }
    }

    static void combPrint(char[] arr, boolean[] visited, int n, List<String> answer) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                StringBuilder append = str.append(arr[i]);
                if(answer.contains(append.toString())) {
                    return;
                }
            }
        }
        answer.add(str.toString());
    }
}
