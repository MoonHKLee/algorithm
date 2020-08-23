package baekjoon.BeeHouse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //입력한 숫자
        int num;
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        int count = 1;
        while(true){
            if(getLayerNum(count)==num) {
                System.out.println("1");
                break;
            }else if(num>getLayerNum(count) && num<=getLayerNum(count+1)){
                System.out.println(count+1);
                break;
            }else{
                count++;
            }
        }
    }
    public static int getLayerNum(int num){
        if(num==1)
            return 1;
        else
            return getLayerNum(num-1) + 6 * num - 6;
    }
}