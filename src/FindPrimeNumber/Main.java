package FindPrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<Integer>();

        //받을 인수의 갯수를 저장하는 변수 선언
        int m = scan.nextInt();
        int n = scan.nextInt();

        int root=(int)Math.sqrt(n);

        // 테이블 배열 선언
        int[] table = new int[n+1];

        // 소수값 배열 선언
        ArrayList<Integer> list = new ArrayList<Integer>();

        //배열에 값 추가하기
        for (int i = 0; i <= n; i++) {
            table[i] = i;
        }

        //소수 구하기 알고리즘 작성.

        for (int i = 2; i <= n; i++) {
            if(table[i]!=0){
                list.add(table[i]);
                for (int j = 0; j <=n; j+=i) {
                    table[j]=0;
                }
            }
        }
        for (int i = root; i <=2 ; i++) {
            if (table[i]==0){
                list.add(table[i]);
            }
        }

        //결과 출력
        for (int i = 0; i < list.size(); i++) {
            if(m<=list.get(i)&&list.get(i)<=n){
                System.out.println(list.get(i));
            }
        }

    }

}