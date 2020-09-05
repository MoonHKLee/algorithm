package KaKao.k01;

public class Solution {
    Place left = new Place(0,0);
    Place right = new Place(2,0);
    Place[] keySet = new Place[10];

    public String solution(int[] numbers, String hand) {
        setKey();
        StringBuilder builder = new StringBuilder();
        for (int number : numbers) {
            builder.append(getResult(number, hand));
        }
        return builder.toString();
    }

    public String getResult(int number, String hand) {
        if(number==1||number==4||number==7){
            this.left = keySet[number];
            return "L";
        }

        if(number==3||number==6||number==9){
            this.right = keySet[number];
            return "R";
        }

        if(getDistance(this.left,keySet[number]) < getDistance(this.right,keySet[number])) {
            this.left = keySet[number];
            return "L";
        }else if(getDistance(this.left,keySet[number]) > getDistance(this.right,keySet[number])) {
            this.right = keySet[number];
            return "R";
        }else {
            if(hand.equals("left")) {
                this.left = keySet[number];
                return "L";
            }else if(hand.equals("right")) {
                this.right = keySet[number];
                return "R";
            }
        }
        return "";
    }

    public int getDistance(Place p1, Place p2) {
        int garo = (int) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x));
        int sero = (int) Math.sqrt((p1.y - p2.y) * (p1.y - p2.y));
        return garo + sero;
    }

    private void setKey() {
        left = new Place(0,0);
        right = new Place(2,0);
        keySet[0] = new Place(1,0);
        keySet[1] = new Place(0,3);
        keySet[2] = new Place(1,3);
        keySet[3] = new Place(2,3);
        keySet[4] = new Place(0,2);
        keySet[5] = new Place(1,2);
        keySet[6] = new Place(2,2);
        keySet[7] = new Place(0,1);
        keySet[8] = new Place(1,1);
        keySet[9] = new Place(2,1);
    }
}

class Place {
    int x;
    int y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
