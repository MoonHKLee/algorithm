package KaKao.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] arr1 = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        String [] arr2 = {"AA", "AB", "AC", "AA", "AC"};
        String [] arr3 = {"XYZ", "XYZ", "XYZ"};
        String [] arr4 = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};

        System.out.println(Arrays.toString(solution.solution(arr4)));

    }
}

class Solution {
    public int[] solution(String[] gems) {
        List<String> list = new ArrayList<>();
        System.out.println("!"+list.size());
        list = copyGem(gems);
        int start = 0;
        int end = 0;
        int count = 0;
        for (String gem : gems) {
            if (!list.contains(gem)) {
                list.add(gem);
            }
        }
        for (int i = 0; i < gems.length-list.size(); i++) {
            count = 0;
            for (int j = i; j <list.size()+i ; j++) {
                if (list.contains(gems[j])){
                    list.remove(gems[i]);
                    count++;
                    System.out.println(list);
                }
            }
            if(count==list.size()){
                start = i;
                end = i+list.size()-1;
                System.out.println("도착");
                break;
            }
        }
        return new int[]{start+1,end+1};
    }
    public List<String> copyGem(String [] str){
        List<String> list = new ArrayList<>();
        for (String gem : str) {
            if (!list.contains(gem)) {
                list.add(gem);
            }
        }
        return list;
    }
}