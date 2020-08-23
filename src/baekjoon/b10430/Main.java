package baekjoon.b10430;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String [] arr = str1.split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        bw.write(Integer.toString((A+B)%C)+"\n");
        bw.write(Integer.toString(((A%C) + (B%C))%C)+"\n");
        bw.write(Integer.toString((A*B)%C)+"\n");
        bw.write(Integer.toString(((A%C) * (B%C))%C));
        bw.flush();
        bw.close();
    }
}
