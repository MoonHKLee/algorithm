package LINE5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String [][] data = new String[5][4];
        data[0][0] = "doc1";data[0][1] = "t1";data[0][2] = "t2";data[0][3] = "t3";
        data[1][0] = "doc1";data[1][1] = "t1";data[1][2] = "t2";data[1][3] = "t3";
        data[2][0] = "doc1";data[2][1] = "t1";data[2][2] = "t2";data[2][3] = "t3";
        data[3][0] = "doc1";data[3][1] = "t1";data[3][2] = "t2";data[3][3] = "t3";
        data[4][0] = "doc1";data[4][1] = "t1";data[4][2] = "t2";data[4][3] = "t3";

        String[] tags = new String[3];
        tags[0]="t1";tags[1]="t2";tags[2]="t3";

        System.out.println(Arrays.toString(solution.solution(data, tags)));
    }
}
