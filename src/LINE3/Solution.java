package LINE3;

public class Solution {
    static int max = 0;
    public int solution(String road, int n){
        int zeroCount = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i)=='0'){
                zeroCount++;
            }
        }
        if(zeroCount<n){
            n=zeroCount;
        }
        boolean[] visited = new boolean[zeroCount];

        comb(visited,0,zeroCount,n,road);
        return max;
    }

    static void comb(boolean[] visited, int depth, int n, int r,String road) {
        if (r == 0) {
            getAnswer(visited, road);
            return;
        }

        if (depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(visited, depth + 1, n, r - 1,road);
            visited[depth] = false;
            comb(visited, depth + 1, n, r,road);
        }
    }

    static void getAnswer(boolean[] visited, String road) {
        StringBuilder str = new StringBuilder(road);
        int count = 0;
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                if (visited[count]) {
                    str.replace(i, i+1, "1");
                }else{
                    str.replace(i, i+1, "0");
                }
                count++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1'){
                length++;
            } else {
                if (max<length){
                    max=length;
                }
                length=0;
            }
        }
        if (max<length){
            max=length;
        }
    }
}
