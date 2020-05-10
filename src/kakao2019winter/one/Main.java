package kakao2019winter.one;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution.solution(board,moves));
    }
}

class Solution {
    public int solution(int[][] board, int [] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[j][moves[i]-1]!=0){
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    if(stack.size()>=2 && stack.get(stack.size()-1).equals(stack.get(stack.size()-2))){
                        stack.pop();
                        stack.pop();
                        answer+=2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
