package CodingTest.Winter.t01;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6, new int[][]{{1, 3, 1}, {3, 5, 0}, {5, 4, 0}, {2, 5, 0}}));
        System.out.println(solution.solution(7, new int[][]{{5, 6, 0}, {1, 3, 1}, {1, 5, 0}, {7, 6, 0},{3,7,1},{2,5,0}}));
    }

    public String solution(int n, int[][] delivery) {
        StringBuilder answer = new StringBuilder();
        //true = 1 false = 2 none = 0;
        int[] arr = new int[n+1];
        for (int i = 0; i < delivery.length; i++) {
            if(delivery[i][2]==1) {
                arr[delivery[i][0]] = 1;
                arr[delivery[i][1]] = 1;
            } else {
                if(arr[delivery[i][0]]==1) {
                    arr[delivery[i][1]] = 2;
                } else if (arr[delivery[i][1]]==1) {
                    arr[delivery[i][0]] = 2;
                }
            }
        }
        for (int i = 0; i < delivery.length; i++) {
            if(delivery[i][2]==1) {
                arr[delivery[i][0]] = 1;
                arr[delivery[i][1]] = 1;
            } else {
                if(arr[delivery[i][0]]==1) {
                    arr[delivery[i][1]] = 2;
                } else if (arr[delivery[i][1]]==1) {
                    arr[delivery[i][0]] = 2;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if(arr[i]==1) {
                answer.append("O");
            }else if(arr[i]==2) {
                answer.append("X");
            } else {
                answer.append("?");
            }
        }
        return answer.toString();
    }
}
