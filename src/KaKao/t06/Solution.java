package KaKao.t06;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][]{{1,0,0,3},{2,0,0,0},{0,0,0,2},{3,0,1,0}},1,0);
        solution.solution(new int[][]{{3,0,0,2},{0,0,1,0},{0,1,0,0},{2,0,0,3}},0,1);
    }

    public int solution(int[][] board, int r, int c) {
        getDistance(board);

        return 0;
    }

    private int getDistance(int[][] board) {
        int x1,y1,x2,y2,cnt = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j]==1) {
                    if(cnt==0){
                        x1 = i;
                        y1 = j;
                        cnt++;
                    }
                    if (cnt==1){
                        x2 = i;
                        y2 = j;
                        break;
                    }
                }
            }
        }
        return 0;
    }
}

