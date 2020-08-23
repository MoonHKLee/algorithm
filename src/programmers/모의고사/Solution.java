package programmers.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 4, 5})));
    }

    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <=answers.length ; i++) {
            if(i%5==0){
                list1.add(5);
            }else if(i%5==1){
                list1.add(1);
            }else if(i%5==2){
                list1.add(2);
            }else if(i%5==3){
                list1.add(3);
            }else if(i%5==4){
                list1.add(4);
            }
        }

        for (int i = 1; i <=answers.length ; i++) {
            if(i%8==0){
                list2.add(5);
            }else if(i%8==1){
                list2.add(2);
            }else if(i%8==2){
                list2.add(1);
            }else if(i%8==3){
                list2.add(2);
            }else if(i%8==4){
                list2.add(3);
            }else if(i%8==5){
                list2.add(2);
            }else if(i%8==6){
                list2.add(4);
            }else if(i%8==7){
                list2.add(2);
            }
        }

        for (int i = 1; i <=answers.length ; i++) {
            if(i%10==0){
                list3.add(5);
            }else if(i%10==1){
                list3.add(3);
            }else if(i%10==2){
                list3.add(3);
            }else if(i%10==3){
                list3.add(1);
            }else if(i%10==4){
                list3.add(1);
            }else if(i%10==5){
                list3.add(2);
            }else if(i%10==6){
                list3.add(2);
            }else if(i%10==7){
                list3.add(4);
            }else if(i%10==8){
                list3.add(4);
            }else if(i%10==9){
                list3.add(5);
            }
        }

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if(list1.get(i)==answers[i]){
                answer1++;
            }
            if(list2.get(i)==answers[i]){
                answer2++;
            }
            if(list3.get(i)==answers[i]){
                answer3++;
            }
        }

        int max = Math.max(answer1,Math.max(answer2,answer3));
        if(answer1 == max){
            answer.add(1);
        }
        if(answer2 == max){
            answer.add(2);
        }
        if(answer3 == max){
            answer.add(3);
        }

        return answer.stream().sorted().mapToInt(v->v).toArray();
    }
}
