package programmers.p14;

public class Solution {
    public static void main(String[] args) {

    }
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>=65&&charArray[i]<=90){
                if(charArray[i]+n>90){
                    charArray[i] = (char)(charArray[i]+n-26);
                }else{
                    charArray[i] = (char)(charArray[i]+n);
                }
            }else if(charArray[i]>=97&&charArray[i]<=122){
                if(charArray[i]+n>122){
                    charArray[i] = (char)(charArray[i]+n-26);
                }else{
                    charArray[i] = (char)(charArray[i]+n);
                }
            }
        }
        for (char c : charArray) {
            answer.append(c);
        }
        return answer.toString();
    }
}
