package baekjoon.b1065;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input information
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int number;
        String inputString;

        inputString = reader.readLine();
        String [] split = inputString.split(" ");
        number = Integer.parseInt(split[0]);

        //logic
        int count = 0;
        for (int i = 1; i <= number ; i++) {
            if(i<=99){
                count++;
            }else {
                String str = Integer.toString(i);
                Integer a = Integer.parseInt(String.valueOf(str.charAt(0)));
                Integer b = Integer.parseInt(String.valueOf(str.charAt(1)));
                Integer c = Integer.parseInt(String.valueOf(str.charAt(2)));
                if(a-b==b-c){
                    count++;
                }
            }
        }
        writer.write(Integer.toString(count));
        writer.flush();
        writer.close();


    }
}
