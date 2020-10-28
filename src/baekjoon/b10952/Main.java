package baekjoon.b10952;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(s[0].equals("0") && s[1].equals("0")) {
                break;
            }
            bw.write((a+b)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
