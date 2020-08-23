package baekjoon.MergeSort;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    int key;

    public static void main(String[] args) {
        //어레이리스트 선언
        LinkedList<Integer> list = new LinkedList<Integer>();

        //받을 인수의 갯수를 저장하는 변수 선언
        int num=scan.nextInt();

        //받을 인수 스캐너로 입력
        for (int i = 0; i < num; i++) {
            list.add(scan.nextInt());
        }

        //baekjoon.MergeSort 알고리즘 작성.


        //결과 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}