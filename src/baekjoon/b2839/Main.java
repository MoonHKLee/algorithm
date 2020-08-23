package baekjoon.b2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        while(n>0){
            if(!(n%5==0)){
                n-=3;
                answer++;
            }else{
                n-=5;
                answer++;
            }
        }
        if(n<0) {
            System.out.print(-1);
        }else{
            System.out.print(answer);
        }
    }
}
