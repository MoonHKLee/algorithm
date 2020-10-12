package programmers.p37;

public class Solution {
    int answer;
    int target;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.target = target;
        getAnswer(0, numbers, 0);
        return answer;
    }

    public void getAnswer(int index, int[] numbers, int number) {
        if(number==this.target && index == numbers.length) {
            answer++;
        }
        if(index == numbers.length) {
            return;
        }
        getAnswer(index+1,numbers,number+numbers[index]);
        getAnswer(index+1,numbers,number-numbers[index]);
    }
}
