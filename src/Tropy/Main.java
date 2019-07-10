package Tropy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX = 0;
        int count = 1;
        
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        //logic start.
        MAX = input[0];
        for (int i = 0; i < n; i++) {
            if( MAX < input[i]){
                MAX = input[i];
                count++;
            }
        }
        System.out.println(count);

        MAX = input[n-1];
        count = 1;
        for (int i = n-1; i >= 0; i--) {
            if( MAX < input[i]){
                MAX = input[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
