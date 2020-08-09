package programmers.p26;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    static int numberOfArea;
    static int maxSizeOfOneArea;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})));
    }

    public int[] solution(int m, int n, int[][] picture) {
        long[][] pictureL = new long[m][n];
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                pictureL[i][j] = picture[i][j];
            }
        }
        Queue<Place> queue = new LinkedList<>();

        List<Long> atom = getAtom(pictureL);
        for (int i = 0; i < atom.size(); i++) {
            getAtomArea(m, n, queue,atom.get(i),pictureL);
        }
        return new int[]{numberOfArea,maxSizeOfOneArea};
    }

    private void getAtomArea(int m, int n, Queue<Place> queue, long atom, long[][] picture) {
        int [] moveX = new int[]{-1,1,0,0};
        int [] moveY = new int[]{0,0,-1,1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(picture[i][j]!=atom){
                    continue;
                }
                int areaSize = 0;
                numberOfArea++;
                queue.offer(new Place(i,j));
                while(!queue.isEmpty()) {
                    Place poll = queue.poll();
                    if(poll.x<0||poll.x>=m||poll.y<0||poll.y>=n){
                        continue;
                    }
                    if(picture[poll.x][poll.y]!=atom) {
                        continue;
                    }

                    picture[poll.x][poll.y] = 0;
                    areaSize++;

                    for (int k = 0; k < 4; k++) {
                        queue.offer(new Place(poll.x+moveX[k],poll.y+moveY[k]));
                    }
                }
                if(areaSize > maxSizeOfOneArea){
                    maxSizeOfOneArea = areaSize;
                }
            }
        }
    }

    public List<Long> getAtom(long[][] picture) {
        List<Long> list = new LinkedList<>();
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if(!list.contains(picture[i][j])) {
                    list.add(picture[i][j]);
                }
            }
        }
        if(list.contains(0L)){
            list.remove(list.indexOf(0L));
        }
        return list;
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
