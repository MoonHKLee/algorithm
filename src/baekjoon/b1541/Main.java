package baekjoon.b1541;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] str = br.readLine().split("-");
        int [] answer = new int[str.length];
        int num = 0;
        for (int i = 0; i < str.length; i++) {
            String [] str2 = str[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < str2.length; j++) {
                int a = Integer.parseInt(str2[j]);
                sum+=a;
            }
            answer[i]=sum;
        }
        num = answer[0];
        for (int i = 1; i < answer.length; i++) {
            num-=answer[i];
        }
        bw.write(Integer.toString(num));
        bw.flush();
        bw.close();
    }
}
