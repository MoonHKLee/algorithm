package b1946;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> answer = new ArrayList<>();
        int  n =Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int [][] arr = new int [m][2];
            for (int j = 0; j < m; j++) {
                String [] str = br.readLine().split(" ");
                arr[j][0] = Integer.parseInt(str[0]);
                arr[j][1] = Integer.parseInt(str[1]);
            }
            //계산
            int count = m;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m ; k++) {
                    if(j==k){
                        continue;
                    }
                    if(arr[j][0]>arr[k][0]&&arr[j][1]>arr[k][1]){
                        count--;
                        break;
                    }
                }
            }
            answer.add(count);
        }
        for (Integer integer : answer) {
            bw.write(integer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
