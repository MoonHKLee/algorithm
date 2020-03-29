package EST;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=2;
        a[4]=4;
        a[5]=4;
        a[6]=4;
        a[7]=3;
        a[8]=4;
        a[9]=3;
        System.out.println(solution.solution(a));
    }
}
