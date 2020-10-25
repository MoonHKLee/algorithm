package CodingTest.NHN.t02;

import java.util.Scanner;

class Main {
    private static void solution(int day, int width, int[][] blocks) {
        int[] result = new int[width];
        int siment = 0;
        for (int i = 0; i < day; i++) {
            //블록채우기
            for (int j = 0; j < blocks[i].length; j++) {
                result[j] += blocks[i][j];
            }
            //꼭대기 찾기
            int topIndex = 0;
            int topBlock = 0;
            for (int j = 0; j < result.length; j++) {
                if(result[j]>topBlock) {
                    topBlock = result[j];
                    topIndex = j;
                }
            }
            //시멘트 붓기
            int top = 0;
            for (int j = 0; j < topIndex; j++) {
                if(result[j] > top) {
                    top = result[j];
                } else {
                    for (int k = result[j]; k < top; k++) {
                        result[j]++;
                        siment++;
                    }
                }
            }
            top = 0;
            for (int j = result.length - 1; j > topIndex; j--) {
                if(result[j] > top) {
                    top = result[j];
                } else {
                    for (int k = result[j]; k < top; k++) {
                        result[j]++;
                        siment++;
                    }
                }
            }
        }
        System.out.println(siment);
    }

    private static class InputData {
        int day;
        int width;
        int[][] blocks;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.blocks = new int[inputData.day][inputData.width];
            for (int i = 0; i < inputData.day; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.width; j++) {
                    inputData.blocks[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.day, inputData.width, inputData.blocks);
    }
}
