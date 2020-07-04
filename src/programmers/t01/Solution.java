package programmers.t01;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }
    public int[] solution(int [] arrayA, int [] arrayB){
        int [] A = Arrays.stream(arrayA).distinct().sorted().toArray();
        int [] B = Arrays.stream(arrayB).distinct().toArray();
        List<Integer> list = Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new));
        List<Integer> list2 = Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new));
        int[] ints = list.stream().mapToInt(v -> v).toArray();
        for (int i = 0; i < list.size(); i++) {
            if(list.contains(arrayB[i])){
                list.retainAll(list2);
            }
        }
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        Queue<Data> queue = new LinkedList<Data>();
        System.out.println(queue.peek().a);
        return null;
    }
    public int [] sum(int [] base, int [] other){
        return
    }
}

class Data{
    int a;
    int b;

    Data(int a, int b){
        this.a = a;
        this.b = b;
    }
}