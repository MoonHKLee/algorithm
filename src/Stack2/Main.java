package Stack2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static LinkedList<Integer> list = new LinkedList<Integer>(); //오름차순의 리스트
    private static LinkedList<Integer> flow = new LinkedList<Integer>(); //수열 순서의 리스트
    private static LinkedList<Integer> stack = new LinkedList<Integer>();//스택의 리스트
    private static ArrayList<String> answer = new ArrayList<String>();
    private static int check = 0;

    public static void main(String[] args) {
        //받을 인수의 갯수를 저장하는 변수 선언
        int num=scan.nextInt();


        //num 까지의 숫자를 리스트에 오름차순으로 저장
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }

        //입력하고자 하는 수열 작성
        for (int i = 0; i < num; i++) {
            flow.add(scan.nextInt());
        }

        int lastNum=0;

        //알고리즘 시작
        while(!flow.isEmpty()) {
            if(lastNum==0||lastNum<flow.getFirst()) {
                //push
                while (stack.isEmpty() || !stack.getFirst().equals(flow.getFirst())) {
                    stack.addFirst(list.removeFirst());
                    answer.add("+");
                }
                check=0;
                //pop
                while (stack.getFirst().equals(flow.getFirst())) {
                    lastNum = stack.removeFirst();
                    flow.removeFirst();
                    answer.add("-");
                    check=1;
                    if(stack.isEmpty()){
                        break;
                    }
                    if(flow.isEmpty()){
                        for (int i = 0; i < answer.size() ; i++) {
                            System.out.println(answer.get(i));
                        }
                        break;
                    }
                }
                if (check==0){
                    System.out.println("NO");
                    break;
                }
                if(flow.isEmpty()){
                    for (int i = 0; i < answer.size() ; i++) {
                        System.out.println(answer.get(i));
                    }
                    break;
                }
            }
            if(lastNum>flow.getFirst()) {
                check=0;
                //pop
                while (stack.getFirst().equals(flow.getFirst())) {
                    lastNum = stack.removeFirst();
                    flow.removeFirst();
                    answer.add("-");
                    check=1;
                    if(stack.isEmpty()){
                        break;
                    }
                    if(flow.isEmpty()){
                        for (int i = 0; i < answer.size() ; i++) {
                            System.out.println(answer.get(i));
                        }
                        break;
                    }
                }
                if (check==0){
                    System.out.println("NO");
                    break;
                }
                if(flow.isEmpty()){
                    for (int i = 0; i < answer.size() ; i++) {
                        System.out.println(answer.get(i));
                    }
                    break;
                }
            }
        }

    }

}
