package CodingTest.ESTSoft.EST2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A){
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        int [] result1 = Arrays.stream(A)
                .map(v->{
                    String str = Integer.toString(v);
                    int addAll = 0;
                    for (int i = 0; i <str.length() ; i++) {
                        addAll+=Integer.parseInt(String.valueOf(str.charAt(i)));
                    }
                    return addAll;
                })
                .toArray();
        int [] digit = Arrays.stream(result1).distinct().toArray();

        for (int i = 0; i < result1.length; i++) {
            int[] tmp = new int[2];
            tmp[0]=A[i];
            tmp[1]=result1[i];
            list.add(tmp);
        }
        for (int i = 0; i < digit.length; i++) {
            int finalI = i;
            List<Integer> list2 = list.stream()
                    .filter(v->v[1]==digit[finalI])
                    .map(v->v[0])
                    .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            if(list2.size()==1){
                return -1;
            }
            int result = list2.get(0)+list2.get(1);
            if(result>answer){
                answer = list2.get(0)+list2.get(1);
            }
        }
        return answer;
    }
}
