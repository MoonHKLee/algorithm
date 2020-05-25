package Pro1.sol2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] stages = {2,1,2,6,2,4,3,3};
        System.out.println(Arrays.toString(solution.solution(5, stages)));
    }

    public int[] solution(int N, int[] stages) {
        int [] arr = new int[N+1];
        int [] arr2 = new int[N+1];
        for (int stage : stages) {
            arr2[stage-1]++;
        }
        Data [] arr3 =new Data[N];
        for (int stage : stages) {
            for (int j = 0; j < stage; j++) {
                arr[j]++;
            }
        }
        for (int i = 0; i < N; i++) {
            float rate = (float)arr2[i]/arr[i];
            arr3[i] = new Data(rate,i+1);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        return null;
    }
}
class Data{
    float rate;
    int num;

    public Data(float rate, int num) {
        this.rate = rate;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Data{" +
                "rate=" + rate +
                ", num=" + num +
                '}';
    }
}
