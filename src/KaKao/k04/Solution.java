package KaKao.k04;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.solution("1S2D*3T"));
        System.out.println(solution.solution("1D2S#10S"));
        System.out.println(solution.solution("1D2S0T"));
        System.out.println(solution.solution("1S*2T*3S"));
        System.out.println(solution.solution("1D#2S*3S"));
        System.out.println(solution.solution("1T2D3D#"));
        System.out.println(solution.solution("1D2S3T*"));
    }

    public int solution(String dartResult) {
        int[] arr = new int[4];
        int index = 0;
        StringBuilder number = new StringBuilder();
        for (char c : dartResult.toCharArray()) {
            if (Character.isDigit(c)){
                number.append(c);
            } else {
                switch (c) {
                    case 'S':
                        arr[index] = Integer.parseInt(number.toString());
                        number = new StringBuilder();
                        break;
                    case 'D':
                        arr[index] = Integer.parseInt(number.toString());
                        arr[index] = arr[index] * arr[index];
                        number = new StringBuilder();
                        break;
                    case 'T':
                        arr[index] = Integer.parseInt(number.toString());
                        arr[index] = arr[index] * arr[index] * arr[index];
                        number = new StringBuilder();
                        break;
                    case '*':
                        index--;
                        if(index == 0) {
                            arr[index] *= 2;
                        }else {
                            arr[index] *= 2;
                            arr[index-1] *= 2;
                        }
                        break;
                    case '#':
                        index--;
                        arr[index] *= -1;
                        break;
                }
                index++;
            }
        }
        return Arrays.stream(arr).sum();
    }

}
