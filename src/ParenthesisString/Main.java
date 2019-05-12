package ParenthesisString;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static LinkedList<Integer> stack = new LinkedList<Integer>();//스택의 리스트

    public static void main(String[] args) {
        //받을 인수의 갯수를 저장하는 변수 선언
        int num=scan.nextInt();

        String[] arr= new String[num];

        //입력하고자 하는 문자열 작성
        for (int i = 0; i < num; i++) {
            arr[i]=scan.next();
        }

        //알고리즘 작성
        for (int i = 0; i < num; i++) {
            //arr[i]==isRight 이면 Yes 아니면 NO 출력
            if(isRight(arr[i])){
                //계산식 출력
                System.out.println("YES");
            }else{
                System.out.println("0");
            }

        }

    }

    private static boolean isRight(String str){
        for (int i = 0; i < str.length(); i++) {
            //소괄호
            if(str.charAt(i)=='('){
                stack.addFirst(0);
            }else if (str.charAt(i)==')'){
                stack.addFirst(1);
                if(!stack.isEmpty()&&stack.size()!=1) {
                    if (stack.get(1) == 0) {
                        stack.removeFirst();
                        stack.removeFirst();
                    }
                }
            //대괄호
            }else if(str.charAt(i)=='['){
                stack.addFirst(2);
            }else{
                stack.addFirst(3);
                if(!stack.isEmpty()&&stack.size()!=1) {
                    if (stack.get(1) == 2) {
                        stack.removeFirst();
                        stack.removeFirst();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            stack.clear();
            return false;
        }
    }
}
