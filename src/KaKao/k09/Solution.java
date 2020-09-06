package KaKao.k09;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})));
    }

    Map<String,String> users;

    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        users = new HashMap<>();
        for (String s : record) {
            String[] split = s.split(" ");

            if(split[0].equals("Enter") || split[0].equals("Change")) {
                users.put(split[1],split[2]);
            }
        }

        for (String s : record) {
            String[] split = s.split(" ");
            if(split[0].equals("Enter")) {
                answer.add(users.get(split[1])+"님이 들어왔습니다.");
            }
            if(split[0].equals("Leave")) {
                answer.add(users.get(split[1])+"님이 나갔습니다.");
            }
        }

        return answer.toArray(String[]::new);
    }
}
