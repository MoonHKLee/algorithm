package CodingTest.LINE.LINE5;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public Object[] solution(String[][] dataSource, String[] tags) {
        List<Result> answer = new ArrayList<>();
            for (int i = 0; i < dataSource.length; i++) {
                for (int j = 1; j < dataSource[i].length; j++) {
                    int count = 0;
                    for (int k = 0; k < tags.length; k++) {
                        if(dataSource[i][j].equals(tags[k])){
                            count++;
                        }
                    }
                    answer.add(new Result(dataSource[i][0],count));
                }
            }
        Object [] answer2;
        answer2 = answer.stream()
                .filter(v->v.num!=0)
                .map(v->v.title)
                .toArray();

        return answer2;
    }
}
class Result {
    String title;
    int num;

    public Result(String title, int num) {
        this.title = title;
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
