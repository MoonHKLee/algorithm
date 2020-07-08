package programmers.p18;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("tRy  hElLo  wOrLd"));
    }
    public String solution(String s) {
        String[] strings = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < strings.length; j++) {
            char[] charArray = strings[j].toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                if (charArray[i] <= 90) {
                    continue;
                } else {
                    charArray[i] = (char) (charArray[i] - 32);
                }

            }
            for (int i = 1; i < charArray.length; i += 2) {
                if (charArray[i] >= 90) {
                    continue;
                } else {
                    charArray[i] = (char) (charArray[i] + 32);
                }
            }
            for (char c : charArray) {
                builder.append(c);
            }
            if(j<strings.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
