package programmers.p05;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days = 4;
        int [] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i = 1; i < a; i++){
            days += month[i];
        }
        days += b;
        days %= 7;
        if(days == 0){
            answer = "SUN";
        }else if(days == 1){
            answer = "MON";
        }else if(days == 2){
            answer = "TUE";
        }else if(days == 3){
            answer = "WED";
        }else if(days == 4){
            answer = "THU";
        }else if(days == 5){
            answer = "FRI";
        }else if(days == 6){
            answer = "SAT";
        }
        return answer;
    }
}
