package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력할 갯수 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //dp 배열 생성
        int[] fibo0 = new int[n+1];
        int[] fibo1 = new int[n+1];

        fibo0[0]=1;
        fibo0[1]=0;
        fibo1[0]=0;
        fibo1[1]=1;
        for (int i = 2; i <= n; i++) {
            fibo0[i]=fibo0[i-1]+fibo0[i-2];
            fibo1[i]=fibo1[i-1]+fibo1[i-2];
        }

        //testCase 배열 생성
        int[] test = new int[n];

        //testCase 배열 입력
        for (int i = 0; i < n; i++) {
            test[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fibo0[test[i]]+" "+fibo1[test[i]]);
        }


    }
}

