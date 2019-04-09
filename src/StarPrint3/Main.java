package StarPrint3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
