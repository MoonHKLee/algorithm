package baekjoon.SMTEST;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //사용할 인스턴스 호출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        String input;

        //첫 번째 줄 입력 값
        input = br.readLine();
        n = Integer.parseInt(input);

        //로직
        if(n%2==0){
            for (int i = 0; i <n/2 ; i++) {
                bw.write("1");
            }
        }else{
            bw.write("7");
            for (int i = 0; i <n/2 - 1 ; i++) {
                bw.write("1");
            }
        }
        bw.flush();
        bw.close();


        //출력값


    }
}
