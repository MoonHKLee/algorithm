package baekjoon.b2661;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main solution = new Main();
        list = new ArrayList<>();

        solution.solution(Integer.parseInt(br.readLine()),"");
        bw.write(list.get(0));
        bw.flush();
        bw.close();
        br.close();
    }

    public void solution(int n, String number) {
        if(!isGoodNumber(number)) {
            return;
        }
        if(number.length()==n) {
            list.add(number);
            return;
        }
        solution(n,number+"1");
        solution(n,number+"2");
        solution(n,number+"3");
    }

    public boolean isGoodNumber(String number) {
        for (int i = number.length() - 2; i >= 0; i-=2) {
            String s1 = number.substring(i, number.length() - i / 2);
            String s2 = number.substring(number.length() - i / 2);
            if(s1.equals(s2)) {
                return false;
            }
        }
        return true;
    }
}
