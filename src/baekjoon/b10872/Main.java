package baekjoon.b10872;

import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        long [] dp = new long [13];
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 2L;
        dp[3] = 6L;
        for (int i = 4; i <=n ; i++) {
            dp[i] = dp[i-1] * i;
        }
        bw.write(""+dp[n]);
        bw.flush();
        bw.close();
    }
}
