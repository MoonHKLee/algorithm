package programmers.pro3.sol1;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {2,6,8,14};
        int [] arr2 = {1,2,3};
        System.out.println(solution.solution(arr));
        solution.solution(arr2);
    }
    public int solution(int[] arr) {
        int gcd = gcd(arr);
        int lcm = gcd;
        for(int i = 0; i < arr.length; ++i) {
            arr[i] /= gcd;
            lcm *= arr[i];
        }
        return lcm;
    }
    private static int gcd(int a, int b) {
        int temp;
        while(b != 0) {
            temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }

    public static int gcd(int[] array) {
        int result;

        if(array.length <= 1)
            return array[0];

        result = gcd(array[0], array[1]);
        for(int i = 2; i < array.length; ++i)
            result = gcd(result, array[i]);

        return result;
    }

}
