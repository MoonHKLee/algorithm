package programmers.p22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{95,95,95,95}, new int[]{4,3,2,1})));

    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = transferToList(progresses);

        while(!isEnd(list)){
            int todayCount = dailyRoutine(list, speeds);
            if(todayCount != 0) {
                answer.add(todayCount);
            }
        }
        return answer.stream().mapToInt(v->v).toArray();
    }

    public boolean isEnd(List<Integer> list) {
        int count = 0;
        for (Integer integer : list) {
            if (integer == -1) {
                count++;
            }
        }
        return count == list.size();
    }

    private List<Integer> transferToList(int[] progresses) {
        List<Integer> list = new LinkedList<>();
        for (int progress : progresses) {
            list.add(progress);
        }
        return list;
    }

    public int dailyRoutine(List<Integer> list, int[] speeds) {
        generateProgress(list, speeds);
        return deleteFinishedProgress(list);
    }

    private void generateProgress(List<Integer> list, int[] speeds) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > -1) {
                list.set(i, list.get(i) + speeds[i]);
            }
        }
    }

    private boolean canDeploy(List<Integer> list) {
        return list.get(getFirstIndex(list)) >= 100;
    }

    private int getFirstIndex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != -1) {
                return i;
            }
        }
        return 0;
    }

    private int deleteFinishedProgress(List<Integer> list) {
        int todayDeployment = 0;
        if (canDeploy(list)) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) == -1){
                    continue;
                }
                if (list.get(i) >= 100) {
                    list.set(i, -1);
                    todayDeployment++;
                }else{
                    return todayDeployment;
                }
            }
        }
        return todayDeployment;
    }
}
