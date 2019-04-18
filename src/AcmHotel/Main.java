package AcmHotel;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int testNumCount;
        //테스트 코드의 갯수를 입력한다.
        testNumCount = scan.nextInt();
        String answer[]= new String[testNumCount];
        for (int i = 0; i < testNumCount; i++) {
            int Y;//호수 앞번호
            int X;//호수 뒷번호

            int h = scan.nextInt();
            int w = scan.nextInt();
            int n = scan.nextInt();

            Y=n%h;
            if(Y==0){
                Y=h;
            }
            if(n%h==0)
                X=n/h;
            else
                X=n/h+1;

            if(0<=X&&X<=9){
                answer[i]= Integer.toString(Y)+"0"+Integer.toString(X);
            }else{
                answer[i]= Integer.toString(Y)+Integer.toString(X);
            }
        }
        for (int i = 0; i <testNumCount ; i++) {
            if(i!=testNumCount-1) {
                System.out.println(Integer.parseInt(answer[i]));
            }
            else {
                System.out.print(Integer.parseInt(answer[i]));
            }
        }
    }

}