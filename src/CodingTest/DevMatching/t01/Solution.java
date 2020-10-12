package CodingTest.DevMatching.t01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("AM 12:01:00",3));
    }

    public String solution(String p, int n) {
        String answer = "";
        String[] split = p.split(" ");
        String pattern = "HH:mm:ss";
        LocalTime time = LocalTime.parse(split[1], DateTimeFormatter.ofPattern(pattern));
        if (split[0].equals("PM")) {
            if(!split[1].startsWith("12")){
                time = time.plusHours(12);
            }
        }
        if (split[0].equals("AM")) {
            if(split[1].startsWith("12")){
                time = time.plusHours(12);
            }
        }
        answer = time.plusSeconds(n).toString();
        String[] split1 = answer.split(":");
        if(split1.length==2){
            answer = answer+":00";
        }
        return answer;
    }
}
