package KaKao.k07;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4, 4, new String[]{"ABCD", "BACE", "BCDD", "BCDD"}));
//        System.out.println(solution.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));//14
//        System.out.println(solution.solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA","TTMMMF","TMMTTJ"}));//15
    }

    LinkedList<Place> queue = new LinkedList<>();
    int deleteCount;

    public int solution(int m, int n, String[] board) {
        deleteCount = 0;
        char[][] block = setBlock(m, n, board);
        while(true) {
            if(deleteTarget(m,n,block)!=0) {
                downBlock(m,n,block);
            }else {
                break;
            }
        }
        return deleteCount;
    }

    public void downBlock(int m, int n, char[][] block) {
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int x = i;
                while (true) {
                    if(x == m-1) {
                        break;
                    }
                    if(!isFloor(x, j, block)) {
                        down(x, j, block);
                        x++;
                    }else{
                        break;
                    }
                }
            }
        }
    }

    public void down(int m, int n, char[][] block) {
        char tmp = block[m][n];
        block[m][n] = block[m+1][n];
        block[m+1][n] = tmp;
    }

    public boolean isFloor(int m, int n, char[][] block) {
        return block[m+1][n]!=' ';
    }

    public char[][] setBlock(int m, int n, String[] board) {
        char[][] block = new char[m][n];
        for (int i = 0; i < board.length; i++) {
            block[i] = board[i].toCharArray();
        }
        return block;
    }

    public int deleteTarget(int m, int n, char[][] board) {
        int delete = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                predicate(i, j, board);
            }
        }
        while(!queue.isEmpty()) {
            Place poll = queue.poll();
            board[poll.x][poll.y] = ' ';
            deleteCount++;
            delete++;
        }
        return delete;
    }

    public void predicate(int m, int n, char[][] board) {
        if(board[m][n] == board[m + 1][n] &&
           board[m][n] == board[m][n + 1] &&
           board[m][n] == board[m + 1][n + 1] &&
           board[m][n] != ' '
        ) {
            addQueue(m, n);
            addQueue(m + 1, n);
            addQueue(m, n + 1);
            addQueue(m + 1, n + 1);
        }
    }

    public void addQueue(int m, int n) {
        for (Place place : queue) {
            if(place.x == m && place.y == n) {
                return;
            }
        }
        queue.offer(new Place(m, n));
    }
}

class Place {
    int x;
    int y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
