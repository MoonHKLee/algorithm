package Goorm.p03;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer,Integer> map = new HashMap<>();
        List<Map<Integer,Integer>> list = new ArrayList<>();

        String inputString = br.readLine();
        String[] s = inputString.split(" ");

        int [] numbers = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])){
                bw.write(map.get(numbers[i])+" ");
            }else{
                int number = compute(numbers[i]);
                map.put(numbers[i],number);
                bw.write(Integer.toString(number)+" ");
            }
        }

        bw.flush();
    }

    public static int compute(int n) {
        return 43*n;
    }
}


