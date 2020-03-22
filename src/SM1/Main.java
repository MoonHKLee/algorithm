package SM1;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //사용할 인스턴스 호출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        int k;
        String input;

        //첫 번째 줄 입력 값
        input = br.readLine();
        String [] arr = input.split(" ");
        n = Integer.parseInt(arr[0]);
        k = Integer.parseInt(arr[1]);

        //두 번째 줄 입력 값
        input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        String[] input3 = input.split(" ");

        //변환
        Integer [] inputList = Arrays.stream(input3).map(Integer::parseInt).toArray(Integer[]::new);

        //로직
        if(n%k == 0){
            bw.write( Integer.toString(n / k) );
        }else if (n==k){

            bw.write("1");
        }else{
            bw.write(Integer.toString(n / (k-1) + 1));
        }
        bw.flush();
        bw.close();


        //출력값


    }
}
