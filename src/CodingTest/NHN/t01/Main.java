package CodingTest.NHN.t01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static int nowIndex = 0;
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
        int[] answer = new int[numOfAllPlayers];
        char soolae = 'A';
        answer[0] = 1;
        List<Character> fastMen = new ArrayList<>();
        for (int i = 0; i < numOfQuickPlayers; i++) {
            fastMen.add(namesOfQuickPlayers[i]);
        }
        char[] arr = new char[numOfAllPlayers-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(66+i);
        }

        for (int i = 0; i < numOfGames; i++) {
            if(numOfMovesPerGame[i] >=0) {
                moveRight(numOfMovesPerGame[i], answer.length-1);
            } else {
                moveLeft(numOfMovesPerGame[i], answer.length-1);
            }
            if(!fastMen.contains(arr[nowIndex])) {
                char tmp = soolae;
                soolae = arr[nowIndex];
                arr[nowIndex] = tmp;
            }
            answer[soolae-65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" "+answer[arr[i]-65]);
        }
        System.out.println(soolae+" "+answer[soolae-65]);
    }
    private static void moveRight(int number, int size) {
        if(nowIndex + number >= size) {
            nowIndex = nowIndex + number - size;
        } else {
            nowIndex = nowIndex + number;
        }
    }

    private static void moveLeft(int number, int size) {
        if(nowIndex + number < 0) {
            nowIndex = size + (nowIndex + number);
        } else {
            nowIndex = nowIndex + number;
        }
    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for(int i = 0; i < inputData.numOfGames ; i++){
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}
