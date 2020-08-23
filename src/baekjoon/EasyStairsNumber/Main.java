package baekjoon.EasyStairsNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[101];
        dp[1]=9;
        for (int i = 2; i <= n ; i++) {
            dp[n]=(2*dp[n-1]-1)%1000000000;
        }
        System.out.println(dp[n]);

    }
}
