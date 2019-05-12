package MakeOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int floor[]=new int[num+1];
        for (int i = 1; i <=num ; i++) {
            floor[i]=scan.nextInt();
        }
        int[] max = new int[301];
        max[1]=floor[1];


    }
}
