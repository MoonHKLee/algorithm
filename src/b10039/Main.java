package b10039;

import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n<=40){
                n=40;
            }
            sum += n;
        }
        bw.write(""+sum/5);
        bw.flush();
        bw.close();
    }
}