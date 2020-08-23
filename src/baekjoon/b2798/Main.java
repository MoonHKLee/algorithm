package baekjoon.b2798;

import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int MAX = 0;

        int [] arr = new int [n];
        str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        //logic

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1 ; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int num = arr[i]+arr[j]+arr[k];
                    if(num > MAX && num <=m){
                        MAX = num;
                    }
                }
            }
        }
        bw.write(""+MAX);
        bw.flush();
        bw.close();

    }
}
