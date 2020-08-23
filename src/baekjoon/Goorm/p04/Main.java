package baekjoon.Goorm.p04;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] banks = br.readLine().split(" ");

        for (int i = 0; i < banks.length; i++) {
            push(bw, copyArray(banks,i+1));
            bw.write("\n");
        }
    }

    private static void push(BufferedWriter bw, String[] banks3) throws IOException {
        Object[] objects = Arrays.stream(banks3).distinct().toArray();
        String[] banks2 = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            banks2[i] = objects[i].toString();
        }
        for (int i = 0; i <banks2.length ; i++) {
            if(i>=5){
                break;
            }
            bw.write(banks2[i]+" ");
        }
        bw.flush();
    }

    public static String[] copyArray(String[] arr, int number) {
        String[] str = new String[number];
        for (int i = 0; i < number; i++) {
            str[i] = arr[i];
        }
        String[] banks3 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            banks3[i] = str[str.length-i-1];
        }
        return banks3;
    }

}


