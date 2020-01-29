package SortAndReverse;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {1,4,2,5,3,7,6,9,8,10};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        Integer [] arr2 = {1,4,2,5,3,7,6,9,8,10};
        Comparator<Integer> reverse = (o1, o2) -> {
            if (o1>o2){
                return -1;
            } else if (o1.equals(o2)){
                return 0;
            } else {
                return 1;
            }
        };
        Arrays.sort(arr2,reverse);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
