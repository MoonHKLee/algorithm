package programmers.p30;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1924", 2));
        System.out.println(solution.solution("1231234", 4));
        System.out.println(solution.solution("4177252841", 7));
    }

    public String solution(String number, int k) {
        String answer = number;
        for (int i = 0; i < k; i++) {
            answer = removeOneCharacter(answer);
        }
        return answer;
    }

    public String removeOneCharacter(String number) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            StringBuilder builder = new StringBuilder(number);
            long num = Long.parseLong(builder.deleteCharAt(i).toString());
            if(num>=max) {
                max = num;
            }
        }
        return String.valueOf(max);
    }
}
