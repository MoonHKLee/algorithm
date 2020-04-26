package b10610;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        //1. 3의 배수
        int middleCount = 0 ;
        for (int i = 0; i < str.length(); i++) {
            middleCount+=Character.getNumericValue(str.charAt(i));
        }
        if(middleCount%3!=0){
            System.out.println(-1);
            return;
        }

        //2. 10의 배수
        boolean isFive=false;
        for (int i = 0; i < str.length(); i++) {
            if(Character.getNumericValue(str.charAt(i))==0){
                isFive=true;
                break;
            }
        }
        if(!isFive){
            System.out.println(-1);
            return;
        }
        //3. 0을 끝으로 보낸다.
        Integer [] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=Character.getNumericValue(str.charAt(i));
        }
        Stream<Integer> answer = Arrays.stream(arr).sorted(Collections.reverseOrder());
        answer.forEach(v-> {
            try {
                bw.write(Integer.toString(v));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.flush();
        bw.close();
    }
}
