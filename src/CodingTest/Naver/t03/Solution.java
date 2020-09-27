package CodingTest.Naver.t03;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("kkaxbycyz","abc"));
    }
    public String solution(String m, String k) {
        StringBuilder builder = new StringBuilder(m);
        int countIndex = 0;
        for (int i = 0; i < k.length(); i++) {
            for (int j = countIndex; j < m.length()-k.length(); j++) {
                System.out.println(builder.charAt(j)+","+k.charAt(i));
                if(builder.charAt(j)==k.charAt(i)){
                    countIndex=j;
                    builder.deleteCharAt(j);
                    break;
                }
            }
        }
        return builder.toString();
    }
}
