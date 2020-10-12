package KaKao.k13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5)));
    }

    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int i = 0;
        int j = 0;
        int count = 1;
        int direction = 1;
        int end = n*(n+1)/2;
        while(true) {
            if(direction==1) {
                arr[i][j] = count;
                if(count==end){
                    break;
                }
                count++;
                if(i+1>n-1||arr[i+1][j]!=0) {

                    direction = 2;
                    j++;
                    continue;
                }
                i++;
                continue;
            }

            if (direction==2) {
                arr[i][j] = count;
                if(count==end){
                    break;
                }
                count++;
                if(j+1>n-1||arr[i][j+1]!=0) {
                    direction = 3;
                    i--;
                    j--;
                    continue;
                }
                j++;
                continue;
            }

            if(direction==3) {
                arr[i][j] = count;
                if(count==end){
                    break;
                }
                count++;
                if(arr[i-1][j-1]!=0) {
                    direction = 1;
                    i++;
                    continue;
                }
                i--;
                j--;
                continue;
            }
            break;
        }

        List<Integer> answer = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < k+1; l++) {
                answer.add(arr[k][l]);
            }
        }
        return answer.stream().mapToInt(v->v).toArray();
    }
}
