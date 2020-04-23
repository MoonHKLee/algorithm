package b1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        if(str.trim().equals("")){
            bw.write("0");
        }else{
            bw.write(Integer.toString(str.trim().split(" ").length));
        }
        bw.flush();
        bw.close();
    }
}
