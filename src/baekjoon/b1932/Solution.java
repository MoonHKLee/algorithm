package baekjoon.b1932;

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE;
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = s[j];
            }
        }
        int[][] dp = new int[size][size];
        dp[0][0] = arr[0][0];

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j]+arr[i][j];
                }else if(j==size-1) {
                    dp[i][j] = dp[i-1][j-1]+arr[i][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
            }
        }

        for (int i : dp[size-1]) {
            if(i > max) {
                max = i;
            }
        }

        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }

}
