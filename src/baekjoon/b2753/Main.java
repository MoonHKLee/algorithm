package baekjoon.b2753;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int a = Integer.parseInt(str);

        if(a%4==0&&a%100!=0||a%400==0){
            bw.write("1");
        }else{
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}
