package Excercise;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a=10;

        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }




        //int a = 3;
        int b = 7;
        System.out.println(add(a,b));

        int num=0;
        while (num!=9){
            System.out.println("1:1을 선택한다     2: 2를 선택한다.     3: 3을 선택한다.      9:종료한다.");
            num=scan.nextInt();
            switch(num){
                case 1:
                    System.out.println("1을 선택함.");
                    break;
                case 2:
                    System.out.println("2를 선택함.");
                    break;
                case 3:
                    System.out.println("3을 선택함.");
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }

     static int add(int a, int b){
        return a+b;
     }
}