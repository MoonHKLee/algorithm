package programmers.p10;

public class Solution {
    public boolean solution(String s) {
        if(s.length()!=4&&s.length()!=6){
            return false;
        }
        char [] arr = s.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (c < 48 || c > 57) {
                count++;
            }
        }
        return count == 0;
    }
}
