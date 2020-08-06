package Goorm.p01;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString = br.readLine();
        if(isValidate(inputString)){
            bw.write("true");
        }else{
            bw.write("false");
        }
        bw.flush();
    }

    public static boolean isValidate(String inputString) {
        if(inputString.charAt(inputString.length()-1)!='2'){
            return false;
        }
        for (int i = 1; i <inputString.length() ; i++) {
            if(inputString.charAt(i-1)=='1'){
                if(inputString.charAt(i)!='2'){
                    return false;
                }
            }
        }
        return true;
    }
}
