package SMTEST2;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //사용할 인스턴스 호출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t;
        int n;
        int m;
        String input;

        //첫 번째 줄 입력 값
        input = br.readLine();
        t=Integer.parseInt(input);
        int [] answer = new int[t];

        //t번 반복
        for (int k = 0; k < t; k++) {
            //두 번째 줄 입력 값
            input = br.readLine();
            String [] arr = input.split(" ");
            n = Integer.parseInt(arr[0]);
            m = Integer.parseInt(arr[1]);
            int [][] inputArr= new int[n][m];
            //타일값 입력
            for (int i = 0; i < n; i++) {
                input = br.readLine();
                arr = input.split(" ");
                for (int j = 0; j < m; j++) {
                    inputArr[i][j] = Integer.parseInt(arr[j]);
                }
                //로직

            }
        }

        //출력

    }
}
