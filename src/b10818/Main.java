package b10818;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[n];

        String[] str =br.readLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }
        arr=Arrays.stream(arr).sorted().toArray(Integer[]::new);
        bw.write(arr[0]+" ");
        arr=Arrays.stream(arr).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        bw.write(arr[0]+" ");
        bw.flush();
        bw.close();
    }
}