package baekjoon.b2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isAnswer = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        inputString = br.readLine();
        int n = Integer.parseInt(inputString);

        for (int i = 1; i <= n; i++) {
            int length = Integer.toString(i).length();
            if(length==1){
                if(i+i==n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else if(length==2){
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else if(length==3){
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else if(length==4){
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))) +
                        Integer.parseInt(String.valueOf(str.charAt(3))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else if(length==5){
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))) +
                        Integer.parseInt(String.valueOf(str.charAt(3))) +
                        Integer.parseInt(String.valueOf(str.charAt(4))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else if(length==6){
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))) +
                        Integer.parseInt(String.valueOf(str.charAt(3))) +
                        Integer.parseInt(String.valueOf(str.charAt(4))) +
                        Integer.parseInt(String.valueOf(str.charAt(5))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }else {
                String str;
                str = Integer.toString(i);
                if(Integer.parseInt(String.valueOf(str.charAt(0))) +
                        Integer.parseInt(String.valueOf(str.charAt(1))) +
                        Integer.parseInt(String.valueOf(str.charAt(2))) +
                        Integer.parseInt(String.valueOf(str.charAt(3))) +
                        Integer.parseInt(String.valueOf(str.charAt(4))) +
                        Integer.parseInt(String.valueOf(str.charAt(5))) +
                        Integer.parseInt(String.valueOf(str.charAt(6))) +
                        i == n){
                    System.out.println(i);
                    isAnswer=true;
                    return;
                }
            }
        }
        if(!isAnswer)
            System.out.println(0);
    }
}