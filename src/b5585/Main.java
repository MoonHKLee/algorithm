package b5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int money = 1000 - scan.nextInt();
        while(money!=0) {
            if (money >= 500) {
                money-=500;
                count++;
            }else if(money>=100){
                money-=100;
                count++;
            }else if(money>=50){
                money-=50;
                count++;
            }
            else if(money>=10){
                money-=10;
                count++;
            }
            else if(money>=5){
                money-=5;
                count++;
            }
            else if(money>=1){
                money-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
