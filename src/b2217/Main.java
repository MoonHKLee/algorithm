package b2217;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int maxWeight = 0;//최대 중량
        int [] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        //배열 정렬 후 작은것을 하나씩 빼가면서 결과값 업데이트
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(maxWeight < arr[i] * (num-i)) {
                maxWeight = arr[i] * (num-i);
            }
        }

        System.out.println(maxWeight);
    }
}
