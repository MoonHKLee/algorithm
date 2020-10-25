package CodingTest.NHN.t03;

import java.util.Scanner;
import java.util.Stack;

class Main {
    private static void solution(int numOfOrder, String[] orderArr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < numOfOrder; i++) {
            String s = orderArr[i];
            stack.push(s.charAt(0));
            while(!stack.isEmpty()) {
                if(stack.peek()>=48 &&stack.peek()<=57) {

                }
            }
        }

    }

    private static class InputData {
        int numOfOrder;
        String[] orderArr;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfOrder = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.orderArr = new String[inputData.numOfOrder];
            for (int i = 0; i < inputData.numOfOrder; i++) {
                inputData.orderArr[i] = scanner.nextLine().replaceAll("\\s+", "");
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfOrder, inputData.orderArr);
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
