package programmers.p23;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(17));
    }
    String answer = "";
    public String solution(int n) {
        getRemainder(n);
        return answer;
    }

    public void getRemainder(int n) {
        if(n == 0){
            return;
        }
        int remainder = n % 3;
        if(remainder == 0){
            getRemainder(n / 3 - 1);
        } else {
            getRemainder(n / 3);
        }
        if(remainder == 0){
            answer = answer + "4";
        } else if(remainder == 1) {
            answer = answer + "1";
        } else {
            answer = answer + "2";
        }
    }
}
