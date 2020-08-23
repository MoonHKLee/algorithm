package baekjoon.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        int y;
        int z;//현재 승률
        int count=0;
        int temp;
        x=scan.nextInt();
        y=scan.nextInt();
        z=y*100/x;
        temp=z;
        do{
            x++;
            y++;
            z=100*y/x;
            count++;
            if(count==1000000000) {
                count=-1;
                break;
            }
        }while(z==temp);
        System.out.println(count);

    }
}
