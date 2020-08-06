package programmers.ESTSOFT.p02;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{1, 3, 7, 8, 10, 15}, 3));
        System.out.println(solution.solution(new int[]{1,2,12,14,15}, 4));
    }

    public int solution(int[] scores, int k) {
        int answer = 0;
        int[] indexArray = getIndexArray(getDiffArray(scores), k,scores.length);
        for (int i = 0; i < k ; i++) {
            int[] ints = Arrays.copyOfRange(scores, indexArray[i], indexArray[i+1]);
            System.out.println(Arrays.toString(ints));
            int sum = ints[ints.length-1] - ints[0];
            answer += sum;
        }
        return answer;
    }

    public int[] getDiffArray(int[] scores) {
        int[] arr = new int[scores.length-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scores[i + 1] - scores[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int[] getIndexArray(int[] diff, int k,int n) {
        int[] arr = new int[k+1];
        for (int i = 1; i < k; i++) {
            int max = getMax(diff);
            int index = getMaxIndex(diff, max);
            arr[i] = index;
            diff[index] = 0;
        }
        arr[k] = n;
        System.out.println(Arrays.toString(arr));
        return Arrays.stream(arr).sorted().toArray();
    }

    public int getMax(int[] diff) {
        int max = Integer.MIN_VALUE;

        for (int value : diff) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }

    private int getMaxIndex(int[] diff, int max) {
        int index = 0;
        for (int j = 0; j < diff.length; j++) {
            if(diff[j]==max){
                index = j;
                break;
            }
        }
        return index;
    }

}
