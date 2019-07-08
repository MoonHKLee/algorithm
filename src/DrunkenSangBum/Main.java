package DrunkenSangBum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(getAnswer(answer[i]));
        }

    }

    public static int getAnswer(int n){
        int k = 0;
        int[] room = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(i%j==0)
                    room[i]=1-room[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(room[i]==1)
                k++;
        }
        return k;
    }
}
