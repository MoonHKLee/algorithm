package HanSoo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = (i % 10);
            if ( i <= 99 ){
                count++;
            }
            if ( 100 <= i && i <= 999 ){
                if(( a - b ) == ( b - c )){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
