package b6603;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean finded = false;
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        //input information
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String [] str = reader.readLine().split(" ");
            if(str[0].equals("0")){
                break;
            }
            int [] arr = new int[Integer.parseInt(str[0])];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i+1]);
            }
            boolean[] visited = new boolean[Integer.parseInt(str[0])];

            //logic
            comb(arr,visited,0,str.length-1,6);
            writer.write("\n");
        }
        writer.flush();
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
    static void printAnswer(int[] arr, boolean[] visited, int n) throws IOException {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i])
                answer.add(arr[i]);
        }
        for (int i = 0; i < answer.size(); i++) {
            writer.write(answer.get(i)+" ");
        }
        writer.write("\n");
    }
}
