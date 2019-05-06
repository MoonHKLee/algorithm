package Stack1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        //받을 인수의 갯수를 저장하는 변수 선언
        int num=scan.nextInt();

        //받을 명령 스캐너로 입력
        for (int i = 0; i < num; i++) {
            String action=scan.next();
            int pushNum;
            switch (action) {
                case "push":
                    pushNum=scan.nextInt();
                    push(pushNum);
                    break;

                case "pop":
                    System.out.println(pop());
                    break;

                case "size":
                    System.out.println(size());
                    break;

                case "empty":
                    System.out.println(empty());
                    break;

                case "top":
                    System.out.println(top());
                    break;

                default:
                    System.out.println("에러요");
            }
        }
    }

    static void push(int num){
        list.addFirst(num);
    }

    static int pop(){
        if(list.isEmpty()) {
            return -1;
        }else{
            return list.removeFirst();
        }
    }

    static int size(){
        return list.size();
    }

    static int empty(){
        if (list.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    static int top(){
        if(!list.isEmpty()) {
            return list.element();
        }else{
            return -1;
        }
    }


}
