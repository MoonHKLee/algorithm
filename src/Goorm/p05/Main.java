package Goorm.p05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] kim = br.readLine().split(" ");
        int[] kim1 = new int[kim.length];

        for (int i = 0; i < kim.length; i++) {
            kim1[i] = Integer.parseInt(kim[i]);
        }

        String[] lee = br.readLine().split(" ");
        int[] lee1 = new int[kim.length];
        for (int i = 0; i < lee.length; i++) {
            lee1[i] = Integer.parseInt(lee[i]);
        }

        for (int i = 0; i < kim.length ; i++) {
            int calculate = kim1[i] - lee1[i];
            if(calculate>=0){
                bw.write(calculate+" ");
            }else{
                bw.write("0 ");
            }
        }
        bw.flush();

    }
}
