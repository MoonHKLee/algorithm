package Line.t05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{12, 7, 11, 6, 2, 12}));
    }
    int hidden = 0;
    int score = 0;
    public int solution(int[] cards) {
        LinkedList<Integer> cardList = new LinkedList<>();
        for (int card : cards) {
            cardList.add(card);
        }
        List<Integer> myCards = new ArrayList<>();
        List<Integer> dealCards = new ArrayList<>();
        while (true){
            if (cardList.isEmpty()){
                break;
            }
            turn1(myCards,cardList.removeFirst());
            if (cardList.isEmpty()){
                break;
            }
            turn2(cardList.removeFirst());
            if (cardList.isEmpty()){
                break;
            }
            turn3(myCards,cardList.removeFirst());
            if (cardList.isEmpty()){
                break;
            }
            turn4(dealCards,cardList.removeFirst());
            if (cardList.isEmpty()){
                break;
            }
            turn5(myCards,dealCards,cardList);
        }
        return score;
    }

    public void turn1(List<Integer> myCards, int card) {
        if(card==11||card==12||card==13){
            myCards.add(10);
            return;
        }
        myCards.add(card);
    }

    public void turn2(int card) {
        if(card==11||card==12||card==13){
            hidden = 10;
            return;
        }
        hidden = card;
    }

    public void turn3(List<Integer> myCards, int card) {
        if(card==11||card==12||card==13){
            myCards.add(10);
            return;
        }
        myCards.add(card);
    }

    public void turn4(List<Integer> dealCards, int card) {
        if(card==11||card==12||card==13){
            dealCards.add(10);
            return;
        }
        dealCards.add(card);
    }

    public void turn5(List<Integer> myCards, List<Integer> dealCards, LinkedList<Integer> cardList) {
        int sum = 0;
        int superSum = 0;
        int dealSum = dealCards.get(0);
        int dealSuperSum = 0;
        for (Integer myCard : myCards) {
            sum += myCard;
        }
        superSum = sum + 10;

        if(myCards.get(0)+myCards.get(1)==11) {
            if (dealCards.get(0)+hidden!=11) {
                bigWin(myCards,dealCards);
            }else{
                draw(myCards,dealCards);
            }
        }
        while (true) {
            if(sum > 21) {
                lose(myCards,dealCards);
            }
            if(dealSum==1||dealSum>=7) {
                if(sum>=17||superSum>=17){
                    break;
                }
                if (cardList.isEmpty()){
                    return;
                }
                int card = cardList.removeFirst();
                if(card==1){
                    sum+=1;
                    superSum+=11;
                }else{
                    sum+=card;
                }
                continue;
            }
            if(dealSum==4||dealSum==5||dealSum==6) {
                break;
            }
            if(dealSum==2||dealSum==3) {
                if(sum>=12||superSum>=12){
                    break;
                }
                if (cardList.isEmpty()){
                    return;
                }
                int card = cardList.removeFirst();
                if(card==1){
                    sum+=1;
                    superSum+=11;
                }else{
                    sum+=card;
                }
            }
        }

        dealSum += hidden;
        dealSuperSum = dealSum+10;
        while (true) {
            if(dealSum > 21){
                win(myCards,dealCards);
                break;
            }
            if(dealSum >= 17 || dealSuperSum >= 17) {
                break;
            }
            if (cardList.isEmpty()){
                return;
            }
            int card = cardList.removeFirst();
            if(card==1){
                dealSum+=1;
                dealSuperSum+=11;
            }else{
                dealSum+=card;
            }
        }
        int player = 0;
        int deal = 0;
        if(superSum<=21) {
            player = superSum;
        }else{
            player = sum;
        }

        if(dealSuperSum<=21) {
            deal = superSum;
        }else{
            deal = sum;
        }
        if(deal>player) {
            lose(myCards,dealCards);
        }else if(deal<player) {
            win(myCards,dealCards);
        }else {
            draw(myCards,dealCards);
        }
    }
    public void lose(List<Integer> myCards, List<Integer> dealCards) {
        myCards.clear();
        dealCards.clear();
        hidden=0;
        score-=2;
        System.out.println("lose");
    }

    public void win(List<Integer> myCards, List<Integer> dealCards) {
        myCards.clear();
        dealCards.clear();
        hidden=0;
        score+=2;
        System.out.println("win");
    }

    public void bigWin(List<Integer> myCards, List<Integer> dealCards) {
        myCards.clear();
        dealCards.clear();
        hidden=0;
        score+=3;
        System.out.println("dinner");
    }

    public void draw(List<Integer> myCards, List<Integer> dealCards) {
        myCards.clear();
        dealCards.clear();
        hidden=0;
        System.out.println("draw");
    }
}
