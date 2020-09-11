package KaKao.k10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[][]{
                {"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}
        }));
    }


    public int solution(String[][] relation) {
        int n = relation.length;
        int m = relation[0].length;
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < (1 << m); i++) {
            Set<String> duplicateCheck = new HashSet<>();
            for (String[] strings : relation) {
                StringBuilder builder = new StringBuilder();
                String binary = getBinary(i, m);
                for (int k = 0; k < binary.length(); k++) {
                    if (binary.charAt(k) == '1') {
                        builder.append(strings[k]).append(" ");
                    }
                }
                builder.deleteCharAt(builder.length() - 1);
                duplicateCheck.add(builder.toString());
            }
            if (!isMinimal(answer, i)) {
                continue;
            }
            if(duplicateCheck.size() == n){
                answer.add(i);
            }
        }
        return answer.size();
    }

    private boolean isMinimal(List<Integer> answer, int i) {
        for (Integer integer : answer) {
            if((integer & i) == integer)
                return false;
        }
        return true;
    }

    public String getBinary(int number,int length) {
        String result = Integer.toBinaryString(number);
        int addCnt = length - result.length();
        return "0".repeat(Math.max(0, addCnt)) + result;
    }
}
