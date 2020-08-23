package baekjoon.b10844;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //길이가 n 인 숫자의 마지막 자릿 수
        int [][] dp = new int [n+1][11];
        for (int i = 1; i <=9 ; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <=n ; i++) {
            dp[i][0] = dp[i-1][1];
            for (int j = 1; j <=9 ; j++) {
                dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
            }
        }

        long sum = 0;
        for (int i = 0; i <10 ; i++) {
            sum+=dp[n][i];
        }

        bw.write(""+sum%1000000000);
        bw.flush();
        bw.close();
    }
}
