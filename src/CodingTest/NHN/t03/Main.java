package CodingTest.NHN.t03;

import java.util.Stack;

class Main {
    private static void solution(int numOfOrder, String[] orderArr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < numOfOrder; i++) {
            String s = orderArr[i];

            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                stack.push(s.charAt(j));
                if(stack.peek()==')') {
                    StringBuilder builder1 = new StringBuilder();
                    stack.pop();
                    while(stack.peek()!='(') {
                        builder1.insert(0,stack.pop());
                    }
                    stack.pop();
                    String string = builder1.toString();

                    StringBuilder builder2 = new StringBuilder();
                    if(stack.peek() >= 48 && stack.peek() <= 57) {//숫자
                        for (int k = 0; k < Character.getNumericValue(stack.peek()); k++) {
                            builder2.append(string);
                        }
                    } else if (stack.peek() >= 65 && stack.peek() <= 90) {
                        for (int k = 0; k < string.length(); k++) {
                            builder2.append(stack.peek());
                            builder2.append(string.charAt(k));
                        }
                    }
                    stack.pop();
                    for (int k = 0; k < builder2.length(); k++) {
                        stack.push(builder2.charAt(k));
                    }
                }
            }
            while (!stack.isEmpty()) {
                Character pop = stack.pop();
                if(stack.isEmpty()) {
                    builder.insert(0,pop);
                    break;
                }
                if(stack.peek() >= 48 && stack.peek() <= 57) {
                    for (int j = 0; j < Character.getNumericValue(stack.peek()); j++) {
                        builder.insert(0,pop);
                    }
                    stack.pop();
                } else {
                    builder.insert(0,pop);
                }
            }
            System.out.println(builder);
        }
    }
}
/*
2
B2(RG)
3(R2(GB))

BRGRG
RGBGBRGBGBRGBGB

3
3(BR2(R))
B(RGB(RG))
1B2R3G

BRRRBRRRBRRR
BRBGBBBRBBBG
BRRGGG
 */
