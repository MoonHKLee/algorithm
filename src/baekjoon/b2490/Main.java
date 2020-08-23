package baekjoon.b2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int [] ans = new int[3];
        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            Integer[] arr = new Integer[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            int answer = 0;
            for (int j = 0; j < 4; j++) {
                answer+=arr[j];
            }
            ans[i]=answer;
        }
        for (int i = 0; i < 3; i++) {
            if(ans[i]==0){
                System.out.println("D");
            }else if(ans[i]==1){
                System.out.println("C");
            }else if(ans[i]==2){
                System.out.println("B");
            }else if(ans[i]==3){
                System.out.println("A");
            }else{
                System.out.println("E");
            }
        }
    }
}
