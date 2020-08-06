package programmers.ESTSOFT.p01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                Arrays.toString(
                        solution.solution(
                                new String[]{
                                        "3285-3764-9934-2453",
                                        "3285376499342453",
                                        "3285-3764-99342453",
                                        "328537649934245",
                                        "3285376499342459",
                                        "3285-3764-9934-2452"
                                }
                        )
                )
        );
    }

    public int[] solution(String[] card_numbers) {
        int[] answer = new int[card_numbers.length];
        for (int i = 0; i < card_numbers.length; i++) {
            answer[i] = isValidate(card_numbers[i]);
        }
        return answer;
    }

    // 현재 카드 번호가 유효한지 확인
    public int isValidate(String card_number) {
        if(!isRightInput(card_number)) {
            return 0;
        }
        if(!isRightLuhn(card_number)){
            return 0;
        }
        return 1;
    }

    public boolean isRightInput(String number) {
        String[] split = number.split("-");
        if(split.length != 4 && split.length != 1) {
            return false;
        }
        if(split.length == 4) {
            for (int i = 0; i < 4; i++) {
                if(split[i].length()!=4){
                    return false;
                }
            }
        }
        if(number.charAt(number.length()-1)=='-'){
            return false;
        }
        String number2 = addNumber(split);
        return number2.length() == 16;
    }

    public String addNumber(String[] number) {
        StringBuilder number2 = new StringBuilder();
        for (String s : number) {
            number2.append(s);
        }
        return number2.toString();
    }

    public boolean isRightLuhn(String realNumber) {
        String number = addNumber(realNumber.split("-"));

        int group1 = 0;
        int group2 = 0;

        for (int i = 0; i < number.length() ; i+=2) {
            int num = Character.getNumericValue(number.charAt(i));
            num *= 2;
            if(num>=10) {
                num = 1 + (num % 10);
            }
            group1 += num;
        }

        for (int i = 1; i < number.length() ; i+=2) {
            int num = Character.getNumericValue(number.charAt(i));
            group2 += num;
        }
        return (group1 + group2) % 10 == 0;
    }

}
