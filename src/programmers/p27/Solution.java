package programmers.p27;

public class Solution {
    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.solution("aabbaccc"));
        System.out.println(solution.solution("ababcdcdababcdcd"));
        System.out.println(solution.solution("abcabcdede"));
        System.out.println(solution.solution("abcabcabcabcdededededede"));
        System.out.println(solution.solution("xababcdcdababcdcd"));
    }

    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= s.length()/2+1; i++) {
            if(zipString(s,i) < answer) {
                answer = zipString(s,i);
            }
        }
        return answer;
    }

    public int zipString(String s, int num) {
        String tmp = "";
        StringBuilder result = new StringBuilder();
        int count = 1;
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < s.length() - s.length() % num; i+=num) {
            if(tmp.equals(builder.substring(i, i + num))){
                count++;
            }else{
                appendString(tmp, result, count);
                tmp = builder.substring(i,i+num);
                count = 1;
            }
        }
        appendString(tmp, result, count);
        if(s.length()%num==0){
            for (int i = s.length() - s.length() % num; i < s.length(); i++) {
                result.append(s.charAt(i));
            }
        }else{
            for (int i = s.length() - s.length() % num; i < s.length(); i++) {
                result.append(s.charAt(i));
            }
        }
        System.out.println("num: "+num+" result: "+result);
        return result.toString().length();
    }

    private void appendString(String tmp, StringBuilder result, int count) {
        if(count==1){
            result.append(tmp);
        }else{
            result.append(count).append(tmp);
        }
    }

}
