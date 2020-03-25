package b1330;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String [] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(a > b){
            bw.write(">");
        } else if(a < b) {
            bw.write("<");
        } else {
            bw.write("==");
        }
        bw.flush();
        bw.close();
    }
}
