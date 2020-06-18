package programmers.p03;

class Solution {

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        Solution solution = new Solution();
        System.out.println(solution.solution(n,lost,reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] totalClothes = new int [n];
        for (int i = 0; i < n; i++) {
            totalClothes[i]=1;
        }
        for (int i : lost) {
            totalClothes[i-1]--;
        }
        for (int i : reserve) {
            totalClothes[i-1]++;
        }

        if(totalClothes[0]==0){
            if (totalClothes[1]==2){
                totalClothes[0]++;
                totalClothes[1]--;
            }
        }

        for (int i = 1; i < n-1; i++) {
            if(totalClothes[i]==0){
                if(totalClothes[i-1]==1 && totalClothes[i+1]==2){
                    totalClothes[i+1]--;
                    totalClothes[i]++;
                }
                if(totalClothes[i-1]==2 && totalClothes[i+1]==1){
                    totalClothes[i-1]--;
                    totalClothes[i]++;
                }
                if(totalClothes[i-1]==2 && totalClothes[i+1]==2){
                    totalClothes[i+1]--;
                    totalClothes[i]++;
                }
            }
        }

        if(totalClothes[n-1]==0){
            if (totalClothes[n-2]==2){
                totalClothes[n-1]++;
                totalClothes[n-2]--;
            }
        }

        for (int i = 0; i < n; i++) {
            if(totalClothes[i]!=0)
                answer++;
        }
        return answer;
    }
}
