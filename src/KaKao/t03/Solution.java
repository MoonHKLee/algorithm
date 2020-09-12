package KaKao.t03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(
                new String[]{
                        "java backend junior pizza 150",
                        "python frontend senior chicken 210",
                        "python frontend senior chicken 150",
                        "cpp backend senior pizza 260",
                        "java backend junior chicken 80",
                        "python backend senior chicken 50"
                },
                new String[]{
                        "java and backend and junior and pizza 100",
                        "python and frontend and senior and chicken 200",
                        "cpp and - and senior and pizza 250",
                        "- and backend and senior and - 150",
                        "- and - and - and chicken 100",
                        "- and - and - and - 150"
                })));
    }

    public int[] solution(String[] info, String[] query) {
        int[] answers = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            List<String[]> infos = new ArrayList<>();
            for (String value : info) {
                infos.add(value.split(" "));
            }
            String[] split = query[i].split(" ");
            infos = filter2(split[7],infos);
            infos = filter1(split[0],infos,0);
            infos = filter1(split[2],infos,1);
            infos = filter1(split[4],infos,2);
            infos = filter1(split[6],infos,3);
            answers[i] = infos.size();
        }
        return answers;
    }

    public List<String[]> filter1(String condition, List<String[]> infos, int index) {
        if (!condition.equals("-")) {
            infos.removeIf(element -> !element[index].equals(condition));
            return infos;
        }
        return infos;
    }

    public List<String[]> filter2(String condition, List<String[]> infos) {
        List<String[]> list = new ArrayList<>();
        for (String[] info : infos) {
            if (Integer.parseInt(info[4])>=Integer.parseInt(condition)) {
                list.add(info);
            }
        }
        return list;
    }
}

class Data {
    String language;
    String job;
    String career;
    String food;
    int point;

    public Data(String language, String job, String career, String food, int point) {
        this.language = language;
        this.job = job;
        this.career = career;
        this.food = food;
        this.point = point;
    }
}
