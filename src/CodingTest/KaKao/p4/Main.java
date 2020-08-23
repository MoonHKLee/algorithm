package CodingTest.KaKao.p4;

public class Main{
    public static void main(String[] args){
        Solution solution =  new Solution();
        int [][] arr1 = {{0,0,0},{0,0,0},{0,0,0}};
        int [][] arr2 = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
        int [][] arr3 = {{0,0,1,0},{0,0,0,0},{0,1,0,1},{1,0,0,0}};
        int [][] arr4 = {{0,0,0,0,0,0},{0,1,1,1,1,0},{0,0,1,0,0,0},{1,0,0,1,0,1},{0,1,0,0,0,1},{0,0,0,0,0,0}};
        solution.solution(arr2);
    }
}

class Solution {
    static int [][] arr;
    static int [] moveX={-1,1,0,0};
    static int [] moveY={0,0,-1,1};
    static int min = Integer.MAX_VALUE;

    public int solution(int [][] board){
        arr = board;
        dfs(0,0,0,-1,-1,arr);
        return min;
    }

    public static void dfs(int x, int y,int count, int beforeX ,int beforeY,int [][] arr){
        if(x<0||y<0||x>arr.length-1||y>arr.length-1){
            return;
        }
        if(arr[x][y]==1){
            return;
        }
        if(x==arr.length-1 && y == arr.length-1){
            min = Math.min(min,count);
        }
        arr[x][y]=1;
        int [][] arr2 = new int [arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            if(beforeX == -1){
                dfs(x+moveX[i],y+moveY[i],count+100,x,y,arr2);

            }else{
                if(beforeX == x && i==0){
                    dfs(x+moveX[i],y+moveY[i],count+600,x,y,arr2);
                }
                if(beforeX == x && i==1){
                    dfs(x+moveX[i],y+moveY[i],count+600,x,y,arr2);
                }
                if(beforeX == x && i==2){
                    dfs(x+moveX[i],y+moveY[i],count+100,x,y,arr2);
                }
                if(beforeX == x && i==3){
                    dfs(x+moveX[i],y+moveY[i],count+100,x,y,arr2);
                }
                if(beforeY == y && i==0){
                    dfs(x+moveX[i],y+moveY[i],count+100,x,y,arr2);
                }
                if(beforeY == y && i==1){
                    dfs(x+moveX[i],y+moveY[i],count+100,x,y,arr2);
                }
                if(beforeY == y && i==2){
                    dfs(x+moveX[i],y+moveY[i],count+600,x,y,arr2);
                }
                if(beforeY == y && i==3){
                    dfs(x+moveX[i],y+moveY[i],count+600,x,y,arr2);
                }
            }
        }
    }
}