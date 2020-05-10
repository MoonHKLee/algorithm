package kakao2019winter.two;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String s3 = "{{20,111},{111}}";
        String s4 = "{{123}}";
        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(Arrays.toString(Solution.solution(s1)));
        System.out.println(Arrays.toString(Solution.solution(s2)));
        System.out.println(Arrays.toString(Solution.solution(s3)));
        System.out.println(Arrays.toString(Solution.solution(s4)));
        System.out.println(Arrays.toString(Solution.solution(s5)));
    }
}
class Solution {
    public static int [] solution(String s){
        String [][] arr2;
        StringBuilder str = new StringBuilder(s);
        str.deleteCharAt(0);
        str.deleteCharAt(s.length()-2);
        String [] arr = str.toString().split("},");
        arr2 = new String[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("\\{","");
            arr[i] = arr[i].replaceAll("}","");
            arr2[i] = arr[i].split(",");
        }
        Arrays.sort(arr2, Comparator.comparingInt(o -> o.length));
        List<String> list = new ArrayList<>();
        for (String[] strings : arr2) {
            for (String string : strings) {
                if (!list.contains(string))
                    list.add(string);
            }
        }
        int [] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}
