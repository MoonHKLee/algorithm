package b10998;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String [] str2 = str1.split(" ");
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);
        bw.write(Integer.toString(a*b));
        bw.flush();
        bw.close();
    }
}
