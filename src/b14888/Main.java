package b14888;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int depth;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        depth = Integer.parseInt(br.readLine());

        String [] str = br.readLine().split(" ");
        arr = new int [str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        str = br.readLine().split(" ");
        int [] operator = new int [4];
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(str[i]);
        }

        //logic
        dfs(arr[0],1,operator);
        bw.write(max+"\n");
        bw.write(min+"");
        bw.flush();
        bw.close();
    }
    public static void dfs(int num,int nowDepth,int [] operator){
        System.out.println("nowDepth: "+nowDepth);
        System.out.println("num: "+num);
        System.out.println(Arrays.toString(operator));
        if(nowDepth == depth){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            System.out.println("end");
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(operator[i]>0){
                operator[i]--;
                if(i==0){
                    System.out.println("plus");
                    dfs(num + arr[nowDepth+1],nowDepth + 1,copyOp(operator));
                }
                if(i==1){
                    System.out.println("minus");
                    dfs(num - arr[nowDepth+1],nowDepth + 1,copyOp(operator));
                }
                if(i==2){
                    System.out.println("multi");
                    dfs(num * arr[nowDepth+1],nowDepth + 1,copyOp(operator));
                }
                if(i==3){
                    System.out.println("divide");
                    dfs(num / arr[nowDepth+1],nowDepth + 1,copyOp(operator));
                }
            }
        }
    }
    public static int [] copyOp(int [] operator){
        int [] arr = new int[4];
        System.arraycopy(operator, 0, arr, 0, operator.length);
        return arr;
    }
}
