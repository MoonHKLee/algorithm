package baekjoon.fibo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long[] dp = new long[91];
        //메모이제이션
        dp[0] = 0;
        dp[1] = 1;
        //내부에 -1로 초기화
        for (int i = 0; i <=90 ; i++) {
            dp[i]=-1;
        }
        System.out.println(fibo(dp,input));
    }

    public static long fibo(long[] dp, int num){
       if(dp[num]!=-1) {
           return dp[num];
       }else{
           if(num==0){
               return 0;
           }else if(num==1){
               return 1;
           }else {
               dp[num]=fibo(dp,num-1)+fibo(dp,num-2);
               return dp[num];
           }
       }
    }
}
