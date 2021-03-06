package baekjoon.b2309;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean finded = false;
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        //input information
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];
        boolean[] visited = new boolean[9];
        String inputString;

        for (int i = 0; i < arr.length; i++) {
            inputString = reader.readLine();
            String [] split = inputString.split(" ");
            arr[i] = Integer.parseInt(split[0]);
        }

        //logic
        comb(arr,visited,0,9,7);
        writer.close();
    }

    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) throws IOException {
        if (r == 0) {
            printAnswer(arr, visited, n);
            return;
        }

        if (depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, n, r - 1);
            visited[depth] = false;
            comb(arr, visited, depth + 1, n, r);
        }
    }
    static void printAnswer(int[] arr, boolean[] visited, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i])
                answer.add(arr[i]);
        }
        int sub = 0;
        for (int i = 0; i < answer.size(); i++) {
            sub+=answer.get(i);
        }
        if(sub == 100 && !finded) {
            answer.stream().sorted().forEach(v-> {
                try {
                    writer.write(v +"\n");
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            finded=true;
        }
    }
}