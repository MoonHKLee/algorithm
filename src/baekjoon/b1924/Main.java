package baekjoon.b1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int answerDay = 0;

        int[] monthDay = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < x; i++) {
            answerDay+= monthDay[i];
        }
        answerDay+=y;
        answerDay%=7;
        if(answerDay==0){
            System.out.print("SUN");
        }else if(answerDay==1){
            System.out.print("MON");
        }else if(answerDay==2){
            System.out.print("TUE");
        }else if(answerDay==3){
            System.out.print("WED");
        }else if(answerDay==4){
            System.out.print("THU");
        }else if(answerDay==5){
            System.out.print("FRI");
        }else {
            System.out.print("SAT");
        }
    }
}
