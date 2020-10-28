package baekjoon.b15649;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        boolean[] visit = new boolean[n + 1];
        dfs(n, m, visit, "","");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int n, int m, boolean[] visit, String s, String s2) throws IOException {
        s=s+s2;
        if (s.length() == m) {
            for (int i = 0; i < s.length(); i++) {
                bw.write(s.charAt(i)+" ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(n, m, visit, s, Integer.toString(i));
                visit[i] = false;
            }
        }
    }
}
