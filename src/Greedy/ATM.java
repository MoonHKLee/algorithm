package Greedy;

import java.util.Arrays;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int[] input = new int[a];

        for (int i = 0; i < a;i++){
            input[i] = scanner.nextInt();
        }

        Arrays.sort(input);

        int answer=0;

        for (int i = 0; i < a; i++){
            for (int j = 0 ; j <= i ;j++ ){
                answer +=input[j];
            }
        }
        System.out.println(answer);
    }
}
