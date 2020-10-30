package CodingTest.NHN.t02;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int day = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        String[] s1 = br.readLine().split(" ");
        int[][] arr = new int[1][Integer.parseInt(s[1])];
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = Integer.parseInt(s1[i]);
        }
        solution(day,Integer.parseInt(s[1]),arr);
    }
    private static void solution(int day, int width, int[][] blocks) {
        int[] result = new int[width];
        int siment = 0;
        for (int i = 0; i < day; i++) {
            //블록채우기
            for (int j = 0; j < blocks[i].length; j++) {
                result[j] += blocks[i][j];
            }
            //꼭대기 찾기
            int topIndex = 0;
            int topBlock = 0;
            for (int j = 0; j < result.length; j++) {
                if(result[j]>topBlock) {
                    topBlock = result[j];
                    topIndex = j;
                }
            }
            //시멘트 붓기
            int top = 0;
            for (int j = 0; j < topIndex; j++) {
                if(result[j] > top) {
                    top = result[j];
                } else {
                    for (int k = result[j]; k < top; k++) {
                        result[j]++;
                        siment++;
                    }
                }
            }
            top = 0;
            for (int j = result.length - 1; j > topIndex; j--) {
                if(result[j] > top) {
                    top = result[j];
                } else {
                    for (int k = result[j]; k < top; k++) {
                        result[j]++;
                        siment++;
                    }
                }
            }
        }
        System.out.println(siment);
    }
}
