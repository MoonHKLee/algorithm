package CodingTest.NHN.t01;

import java.util.ArrayList;
import java.util.List;

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
}
