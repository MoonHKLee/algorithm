package baekjoon.Naver.h1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 6;
        int [][] arr = new int[6][3];
        arr[0][0]=5;arr[0][1]=6;arr[0][2]=0;
        arr[1][0]=1;arr[1][1]=3;arr[1][2]=1;
        arr[2][0]=5;arr[2][1]=4;arr[2][2]=0;
        arr[3][0]=2;arr[3][1]=5;arr[3][2]=0;
        arr[4][0]=2;arr[4][1]=5;arr[4][2]=0;
        arr[5][0]=2;arr[5][1]=5;arr[5][2]=0;
        System.out.println(solution.solution(a,arr));

    }
}
