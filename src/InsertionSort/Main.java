package InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    int key;

    public static void main(String[] args) {
        //어레이리스트 선언
        ArrayList<Integer> list = new ArrayList<Integer>();

        //받을 인수의 갯수를 저장하는 변수 선언
        int num=scan.nextInt();

        //받을 인수 스캐너로 입력
        for (int i = 0; i < num; i++) {
            list.add(scan.nextInt());
        }
        
        //insertionSort 알고리즘 작성.
        int i,j;
        for (i = 1; i < list.size(); i++) {
            int key = list.get(i);
            for (j=i-1;j>=0&&list.get(j)>key;j--){
                list.set(j+1,list.get(j));
            }
            list.set(j+1,key);
        }












        
        //결과 출력
        for ( i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}