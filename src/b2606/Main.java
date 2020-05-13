package b2606;

import java.io.*;

import static java.lang.System.in;

public class Main {
    static int count = 0;
    static int [][] arr;
    static boolean [] visit;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for (int i = 1; i <= m; i++) {
            String[] s = br.readLine().split(" ");
            arr[Integer.parseInt(s[0])][Integer.parseInt(s[1])]=1;
            arr[Integer.parseInt(s[1])][Integer.parseInt(s[0])]=1;
        }
        dfs(1);
        bw.write(""+(count-1));
        bw.flush();
        bw.close();

    }
    public static void dfs(int startNum){
        if(visit[startNum]){
            return;
        }
        visit[startNum]=true;
        count++;
        for (int i = 1; i <= n; i++) {
            if(arr[startNum][i]==1){
                dfs(i);
            }
        }
    }
}
