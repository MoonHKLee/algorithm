package baekjoon.b14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //input data
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        inputString = reader.readLine();
        int n = Integer.parseInt(inputString);
        int [] days = new int[n+10];
        int [] profit = new int[n+10];
        int [] dp = new int[n+10];
        int max = 0;

        for (int i = 1; i <= n ; i++) {
            inputString = reader.readLine();
            String [] split = inputString.split(" ");
            days[i] = Integer.parseInt(split[0]);
            profit[i] = Integer.parseInt(split[1]);
        }

        //logic
        for (int i = 1; i <=n+1; i++) {
            dp[i] = Math.max(dp[i], max);
            dp[days[i]+i] = Math.max(dp[days[i]+i],profit[i]+dp[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}
