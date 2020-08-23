package programmers.Leve1.sol2;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(13);
    }
    public long solution(long n) {
        long answer = 0;
        System.out.println(getAnswer(getNum(getSeung(n))));
        return answer;
    }

    public long getAnswer(long n){
        long answer = 0;
        if(n==1){
            return 1;
        }
        answer += getAnswer(n-getSeung(n));
        return answer;
    }

    public long getSeung(long n){
        long seung = 0;
        long start = 1;
        while(true){
            start*=2;
            if(start>=n){
                break;
            }
            seung++;
        }
        return seung;
    }

    public long getNum(long n){
        int num = 1;
        for (int i = 0; i < n; i++) {
            num *= 3;
        }
        return num;
    }
}
