package CodeForce.t01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        if (number % 2 ==0) {
            if (number==2) {
               bw.write("NO");
            } else{
                bw.write("YES");
            }
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
    }

}
