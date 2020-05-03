package DfsBfs;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //정점의 개수 입력
        int vertexNum = scan.nextInt();

        LinkedList adjList[] = new LinkedList[vertexNum+1];
        for (int i = 1; i <=vertexNum ; i++) {
            adjList[i]=new LinkedList();
        }

        //간선의 개수 입력
        int edgeNum = scan.nextInt();

        //시작 할 정점의 번호
        int startNum = scan.nextInt();
        
        //간선이 연결하는 두 정점의 번호
        for (int i = 0; i < edgeNum; i++) {
            int firstNum = scan.nextInt();
            int secondNum= scan.nextInt();
            adjList[firstNum].add(secondNum);
            adjList[secondNum].add(firstNum);
        }

        //DFS 알고리즘 작성
        System.out.println("DFS");


        //BFS 알고리즘 작성
        System.out.println("BFS");


    }
}

