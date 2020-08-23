package baekjoon.PrintRight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line="";
        while(scan.hasNextLine()){
            line=scan.nextLine();
            System.out.println(line);
        }
    }
}