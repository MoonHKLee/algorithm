package baekjoon.IntegerTriangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;

        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j]=sc.nextInt();
                if(j==1) dp[i][j]=dp[i-1][1];
                else if(j==i) dp[i][j]=dp[i-1][j];
            }
        }
    }

    public static int getMax(int a, int b){
        return a > b ? a : b;
    }
}
