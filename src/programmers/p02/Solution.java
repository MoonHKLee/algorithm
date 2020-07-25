package programmers.p02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(Character.getNumericValue('1'));
        char[] chars = s.toCharArray();
        Integer[] arr = new Integer[10];
        Arrays.sort(arr,Collections.reverseOrder());
    }

    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i <clothes.length ; i++) {
            if(map.containsKey(clothes[i][1])){
            }
        }
        return answer;
    }
}

class Hello implements Comparable<Hello> {

    int a;
    int b;

    public Hello(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Hello o) {
        return 0;
    }
}
