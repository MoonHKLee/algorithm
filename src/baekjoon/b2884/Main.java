package baekjoon.b2884;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String [] arr = str.split(" ");
        int hours = Integer.parseInt(arr[0]);
        int minutes = Integer.parseInt(arr[1]);

        if(minutes<45){
            minutes+=15;
            hours-=1;
            if (hours==-1){
                hours=23;
            }
        }else{
            minutes-=45;
        }
        bw.write(hours + " "+ minutes);
        bw.flush();
        bw.close();
    }
}
