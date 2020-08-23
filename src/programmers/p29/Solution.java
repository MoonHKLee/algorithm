package programmers.p29;

import java.util.LinkedList;

public class Solution {

    public int solution(String name) {
        int answer = 0;
        Blank blank = new Blank(name);
        while (!isCorrect(name, blank.builder)) {
            answer += blank.moveToNearCharacterNotA();
            answer += blank.moveToChar(name.charAt(blank.place));
        }
        return answer;
    }

    public boolean isCorrect(String name, StringBuilder builder) {
        return name.equals(builder.toString());
    }

}

class Blank {
    StringBuilder builder;
    String name;
    LinkedList<Integer> checkList;
    int place;

    public Blank(String name) {
        this.builder = new StringBuilder();
        this.name = name;
        this.checkList = new LinkedList<>();
        builder.append("A".repeat(name.length()));
        this.place = 0;
    }

    public int moveToChar(char spell) {
        this.builder.replace(this.place, this.place + 1, Character.toString(spell));
        return Math.min(moveUp(spell),moveDown(spell));
    }

    public int moveUp(char spell) {
        return spell - 65;
    }

    public int moveDown(char spell) {
        return 91 - spell;
    }

    public int moveToNearCharacterNotA() {
        int movingDistance1 = 0;
        int movingDistance2 = 0;
        int index1 = this.place;
        int index2 = this.place;

        //우로이동
        while(name.charAt(index1)==65 || checkList.contains(index1)) {
            index1++;
            movingDistance1++;
            if(index1 > name.length()-1) {
                index1 = 0;
            }
        }

        //좌로이동
        while(name.charAt(index2)==65 || checkList.contains(index2)) {
            index2--;
            movingDistance2++;
            if(index2<0) {
                index2 = name.length()-1;
            }
        }

        if(movingDistance1 <= movingDistance2) {
            this.place = index1;
        }else {
            this.place = index2;
        }
        checkList.offer(this.place);
        return Math.min(movingDistance1, movingDistance2);
    }
}