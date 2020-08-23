package programmers.pro2.sol2;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "01033334444";
        String str2 = "027778888";
        System.out.println(solution.solution(str1));
    }
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder str = new StringBuilder(phone_number);
        for (int i = 0; i < phone_number.length()-4; i++) {
            str.replace(i,i+1,"*");
        }
        answer = str.toString();
        return answer;
    }
}
