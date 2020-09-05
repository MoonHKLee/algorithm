package KaKao.k06;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution("FRANCE", "french"));
        System.out.println(solution.solution("handshake", "shake hands"));
        System.out.println(solution.solution("aa1+aa2", "AAAA12"));
        System.out.println(solution.solution("E=M*C^2", "e=m*c^2"));
    }

    public int solution(String str1, String str2) {
        ArrayList<String> list1 = getStringElements(str1);
        ArrayList<String> list2 = getStringElements(str2);
        if(list1.size() + list2.size() == 0) {
            return 65536;
        }
        return getJacadSimilarity(list1, list2);
    }

    public ArrayList<String> getStringElements(String str) {
        ArrayList<String> list = new ArrayList<>();
        String s = str.toUpperCase();
        for (int i = 0; i < str.length()-1; i++) {
            if (s.charAt(i) < 65 || s.charAt(i) > 90 ||s.charAt(i+1) < 65 || s.charAt(i+1) > 90 ) {
                continue;
            }
            String s1 = "" + s.charAt(i) + s.charAt(i + 1);
            list.add(s1);
        }
        return list;
    }

    public int getJacadSimilarity(ArrayList<String> list1, ArrayList<String> list2) {
        int union = getUnion((ArrayList<String>) list1.clone(), (ArrayList<String>) list2.clone()).size();
        int intersection = getIntersection((ArrayList<String>) list1.clone(), (ArrayList<String>) list2.clone()).size();
        return (int)((double)intersection / union * 65536);
    }

    public ArrayList<String> getIntersection(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> clone1 = (ArrayList<String>) list1.clone();
        ArrayList<String> clone2 = (ArrayList<String>) list2.clone();
        ArrayList<String> answer = new ArrayList<>();
        for (String s : clone1) {
            if(clone2.contains(s)) {
                answer.add(s);
                clone2.remove(clone2.lastIndexOf(s));
            }
        }
        return answer;
    }

    public ArrayList<String> getUnion(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> clone1 = (ArrayList<String>) list1.clone();
        ArrayList<String> clone2 = (ArrayList<String>) list2.clone();
        ArrayList<String> intersection = getIntersection(clone1, clone2);
        clone1.addAll(clone2);
        for (String s : intersection) {
            clone1.remove(clone1.lastIndexOf(s));
        }
        return clone1;
    }
}
