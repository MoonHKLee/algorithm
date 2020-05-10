package KaKao.p1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {1,3,4,5,8,2,1,4,5,9,5};
        int [] arr2 = {7,0,8,2,8,3,1,5,7,6,2};
        int [] arr3 = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(solution.solution(arr,"right"));
    }
}

class Solution {
    public String solution(int[] numbers,String hand){
        StringBuilder answer= new StringBuilder();
        int nowLeft = 10;
        int nowRight = 12;
        for (int number : numbers) {
            if(number==1||number==4||number==7){
                answer.append("L");
                nowLeft=number;
            }else if(number==3||number==6||number==9){
                answer.append("R");
                nowRight=number;
            }else{
                if (getLength(nowLeft, number) < getLength(nowRight, number)) {
                    answer.append("L");
                    nowLeft = number;
                } else if (getLength(nowLeft, number) > getLength(nowRight, number)) {
                    answer.append("R");
                    nowRight = number;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        nowLeft = number;
                    } else {
                        answer.append("R");
                        nowRight = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    public int getLength(int x, int y){
        int count = 0;
        if(x==0){
            x=11;
        }
        if(y==0){
            y=11;
        }
        x--;
        y--;
        while(true) {
            if (x == y) {
                return count;
            }
            if (x % 3 == y % 3) {
                if (x > y) {
                    x -= 3;
                } else {
                    y -= 3;
                }
            } else {
                if (x % 3 > y % 3) {
                    x--;
                } else {
                    y--;
                }
            }
            count++;
        }
    }
}