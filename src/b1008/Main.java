package b1008;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String [] str2 = str1.split(" ");
        BigDecimal a = new BigDecimal(str2[0]);
        BigDecimal b = new BigDecimal(str2[1]);
        bw.write(String.valueOf(a.divide(b, MathContext.DECIMAL64)));
        bw.flush();
        bw.close();
    }
}
