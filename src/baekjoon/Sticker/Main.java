package baekjoon.Sticker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=0;
        Scanner scan = new Scanner(System.in);
        num1=scan.nextInt();

        for (int i = 0; i < num1; i++) {
            num2 = scan.nextInt();
            int[][] max = new int[2][num2];
            for (int j = 0; j <num2 ; j++) {
                num3 = scan.nextInt();
                max[0][j] = num3;
            }
            for (int j = 0; j <num2 ; j++) {
                num3 = scan.nextInt();
                max[1][j] = num3;
            }
        }
    }
}
