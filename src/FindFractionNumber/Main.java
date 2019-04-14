package FindFractionNumber;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int mom=1;
        int son=1;
        int momHigh=2;
        int sonHigh=1;
        int count = 1;

        num=scan.nextInt();

        do {
            while(mom<momHigh&&count!=num){
                mom++;
                count++;
            }
            while(mom>1&&count!=num){
                mom--;
                count++;
            }
            count++;
            if(count==num)
                break;
            momHigh+=2;
        }while(count<num);
        count=1;
        do {
            while(son<sonHigh&&count!=num){
                son++;
                count++;
            }
            while(son>1&&count!=num){
                son--;
                count++;
            }
            count++;
            if(count==num)
                break;
            sonHigh+=2;
        }while(count<num);
        System.out.println(son+"/"+mom);





    }
}