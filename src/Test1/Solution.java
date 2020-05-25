package Test1;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution("a B z",4));
        System.out.println(solution.solution2(626331));
    }
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            if (num >= 65 && num <= 90) {
                if(num+n>=91){
                    num=num-26;
                }
                answer.append((char)(num + n));
            } else if (num >= 97 && num <= 122) {
                if(num+n>=123){
                    num=num-26;
                }
                answer.append((char)(num + n));
            } else{
                answer.append((char)num);
            }
        }
        return answer.toString();
    }

    public int solution2(int nim) {
        long num = nim;
        int answer = 0;
        while(num!=1){
            if(num % 2 == 0){
                System.out.println(num);
                num/=2;
            }else{
                System.out.println(num);
                num = num * 3 + 1;
            }
            answer++;
            if(answer>=501){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
