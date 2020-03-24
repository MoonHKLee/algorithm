package b2588;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        bw.write(Integer.parseInt(String.valueOf(str2.charAt(2)))*a+"\n");
        bw.write(Integer.parseInt(String.valueOf(str2.charAt(1)))*a+"\n");
        bw.write(Integer.parseInt(String.valueOf(str2.charAt(0)))*a+"\n");
        bw.write(Integer.toString(a*b));
        bw.flush();
        bw.close();
    }
}
