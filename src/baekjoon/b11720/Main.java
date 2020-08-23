package baekjoon.b11720;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
