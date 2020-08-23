package baekjoon.b11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        int[] coinValue = new int[n];
        for (int i = 0; i <n ; i++) {
            coinValue[i]=sc.nextInt();
        }

        //알고리즘 작성
        for (int i = n - 1 ; i >= 0 ; i--) {
            while(k >= coinValue[i]){
                k-=coinValue[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
