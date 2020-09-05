package KaKao.k05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("100-200*300-500+20"));
        System.out.println(solution.solution("50*6-3*2"));
    }

    public long solution(String expression) {
        long answer = Long.MIN_VALUE;
        long[] answers = new long[6];

        answers[0] = Math.abs(calculate('+','-','*', expression));
        answers[1] = Math.abs(calculate('+','*','-', expression));
        answers[2] = Math.abs(calculate('-','+','*', expression));
        answers[3] = Math.abs(calculate('-','*','+', expression));
        answers[4] = Math.abs(calculate('*','-','+', expression));
        answers[5] = Math.abs(calculate('*','+','-', expression));

        for (long l : answers) {
            if (l > answer) {
                answer = l;
            }
        }

        return answer;
    }

    public long calculate(char a, char b, char c, String expression ) {
        List<Long> numbers = Arrays.stream(expression.split("-|\\*|\\+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        List<Character> operators = Arrays.stream(expression.split("[0-9]"))
                .filter(v-> !v.equals(""))
                .map(v->v.charAt(0))
                .collect(Collectors.toList());

        calc(a, numbers, operators);
        calc(b, numbers, operators);
        calc(c, numbers, operators);

        return numbers.get(0);
    }

    private void calc(char a, List<Long> numbers, List<Character> operators) {
        int count = (int) operators.stream().filter(v-> v == a).count();
        while (count != 0) {
            for (int i = 0; i < numbers.size(); i++) {
                if(operators.get(i) == a) {
                    if(a =='*') {
                        numbers.set(i, numbers.get(i) * numbers.get(i+1));
                        numbers.remove(i+1);
                        operators.remove(i);
                        count--;
                        break;
                    }
                    if(a =='+') {
                        numbers.set(i, numbers.get(i) + numbers.get(i+1));
                        numbers.remove(i+1);
                        operators.remove(i);
                        count--;
                        break;
                    }
                    if(a =='-') {
                        numbers.set(i, numbers.get(i) - numbers.get(i+1));
                        numbers.remove(i+1);
                        operators.remove(i);
                        count--;
                        break;
                    }
                }
            }
        }
    }
}
