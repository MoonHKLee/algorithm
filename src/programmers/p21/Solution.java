package programmers.p21;

class Solution {
    public static void main(String[] args) {

    }
    public int solution(String arrangement) {
        int answer = 0;
        int stack = 0;
        String replace = arrangement.replace("()", "0");

        System.out.println(arrangement);
        for (int i = 0; i < arrangement.length(); i++){
            if(arrangement.charAt(i) == '('){
                stack++;
            }
            if(arrangement.charAt(i) == '1'){
                answer += stack;
                System.out.println(answer);
            }
            if(arrangement.charAt(i) == ')'){
                stack--;
                answer++;
                System.out.println(answer);
            }
        }

        return answer;
    }
}
