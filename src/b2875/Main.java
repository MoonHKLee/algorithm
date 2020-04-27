package b2875;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int n,m,k = 0;
        n = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);
        k = Integer.parseInt(arr[2]);

        for (int i = 0; i < k; i++) {
            if(n >= 2 * m){
                n--;
            }else{
                m--;
            }
        }
        int answer = Math.min(n/2,m);
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
