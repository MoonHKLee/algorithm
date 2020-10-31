package CodingTest.Winter.t02;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("qyyigoptvfb", "abcdefghijk", 3));
    }
    public String solution(String encrypted_text, String key, int rotation) {
        String answer = rotateReverse(encrypted_text,rotation);
        System.out.println(answer);
        answer = keyReverse(answer,key);
        return answer;
    }

    public String rotateReverse(String string, int n) {
        StringBuilder builder = new StringBuilder(string);
        if(n>0) {
            for (int i = 0; i < n; i++) {
                builder.append(builder.charAt(0));
                builder.deleteCharAt(0);
            }
        } else {
            n = -n;
            for (int i = 0; i < n; i++) {
                builder.insert(0,builder.charAt(string.length()-1));
                builder.deleteCharAt(builder.length()-1);
            }
        }
        return builder.toString();
    }

    public String keyReverse(String string, String key) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            char k = key.charAt(i);
            char result = 0;
            if(c - k < 0) {
                result = (char)((c-k)+122);
            }else {
                result = (char)(c-k+96);
            }
            builder.replace(i,i+1, String.valueOf(result));
        }
        return builder.toString();
    }
}
