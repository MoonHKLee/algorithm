package b7568;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String [] str;
        int [][] arr = new int [n][2];
        int [] answer = new int [n];
        Arrays.fill(answer, 1);

        for (int i = 0; i < arr.length; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[0] > arr[j][0] && ints[1] > arr[j][1]) {
                    answer[j]++;
                }
            }
        }

        for (int value : answer) {
            bw.write(value + " ");
        }
        bw.flush();
        bw.close();
    }
}