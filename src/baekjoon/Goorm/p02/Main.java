package baekjoon.Goorm.p02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString = br.readLine();
        if (isValidate(inputString)) {
            bw.write("true");
        } else {
            bw.write("false");
        }
        bw.flush();
    }

    public static boolean isValidate(String inputString) {
        String[] numbers = inputString.split(" ");

        if (numbers.length != 6) {
            return false;
        }

        if (!isUnder45(numbers)) {
            return false;
        }

        if (!isSorted(numbers)){
            return false;
        }
        return true;
    }

    public static boolean isUnder45(String[] numbers) {
        for (String s : numbers) {
            int number = Integer.parseInt(s);
            if (number < 1 || number > 45) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i])<=Integer.parseInt(numbers[i-1])){
                return false;
            }
        }
        return true;
    }
}
