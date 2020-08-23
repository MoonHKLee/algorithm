package baekjoon.b2577;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A,B,C = 0;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        int sum = A * B * C;
        String str = Integer.toString(sum);
        int [] answer = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int a = Character.getNumericValue(str.charAt(i));
            answer[a]++;
        }
        for (int i = 0; i < answer.length; i++) {
            bw.write(answer[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
