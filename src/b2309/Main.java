package b2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int [9];
        int n = 7 ;
        boolean [] visited = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            combination(arr,visited,0,n,i);
        }

    }

    static void combination(int [] arr, boolean [] visited, int depth, int n, int r){
        if (r==0){
            getAnswer(arr, visited, n);
            return;
        }
        if (depth != n) {
            visited[depth] = true;
            combination(arr, visited, depth + 1, n, r - 1);

            visited[depth] = false;
            combination(arr, visited, depth + 1, n, r);
        }
    }
    static void getAnswer(int[] arr, boolean[] visited, int n) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if(visited[i])
                count+=arr[i];
        }
        if (count == 100) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(1);
        }
    }
}