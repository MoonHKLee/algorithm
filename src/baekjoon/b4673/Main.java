package baekjoon.b4673;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //초기화
        int [] arr = new int [12000];
        for (int i = 1; i <=10000; i++) {
            arr[i]=i;
        }
        //logic
        for (int i = 1; i <=10000 ; i++) {
            int answer = 0;
            String number = Integer.toString(i);
            for (int j = 0; j <number.length() ; j++) {
                answer+=Character.getNumericValue(number.charAt(j));
            }
            answer+=i;
            arr[answer]=0;
        }
        Arrays.stream(arr).forEach(v->{
            if (v!=0){
                System.out.println(v);
            }
        });
    }
}
