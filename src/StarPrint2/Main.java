package StarPrint2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
