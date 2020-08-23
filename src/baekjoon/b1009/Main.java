package baekjoon.b1009;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int answer = 1;
            for (int j = 0; j < arr[1]; j++) {
                answer = (answer % 10) * arr[0] % 10;
            }
            if(answer == 0){
                bw.write(10 +"\n");
            }else{
                bw.write(answer +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
