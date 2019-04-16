package FlyMeToTheAlphaCentauri;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        long num =0;
        long testNumCount=0;
        long firstNum=0;
        long secondNum=0;
        long n = 1L;
        //테스트 코드의 갯수를 입력한다.
        testNumCount = scan.nextInt();
        for (long i = 0L; i < testNumCount; i++) {
            firstNum = scan.nextInt();
            secondNum = scan.nextInt();
            num = secondNum - firstNum;
            while (true) {
                if (num <A(n+1)) {
                    System.out.println(n+1);
                    break;
                } else {
                    n++;
                }
            }
        }
    }
    public static long A(long n) {
        long count=1L;
        long start=0L;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                start++;
                count+=start;
            }else{
                count+=start;
            }
        }
        return count;
    }
}