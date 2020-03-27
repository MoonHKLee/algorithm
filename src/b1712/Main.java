package b1712;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String [] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        if (b>=c){
            bw.write("-1");
        }else{
            bw.write(Integer.toString(a/(c-b)+1));
        }
        bw.flush();
        bw.close();
    }
}
