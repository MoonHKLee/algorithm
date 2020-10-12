package CodingTest.Coupang.t04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("SEOUL",
                "DAEGU",
                "YEOSU",
                new String[][]{
                        {"ULSAN", "BUSAN"},
                        {"DAEJEON", "ULSAN"},
                        {"DAEJEON", "GWANGJU"},
                        {"SEOUL", "DAEJEON"},
                        {"SEOUL", "ULSAN"},
                        {"DAEJEON", "DAEGU"},
                        {"GWANGJU", "BUSAN"},
                        {"DAEGU", "GWANGJU"},
                        {"DAEGU", "BUSAN"},
                        {"ULSAN", "DAEGU"},
                        {"GWANGJU", "YEOSU"},
                        {"BUSAN", "YEOSU"}
                }
        ));//9
    }
    int answer;
    public int solution(String depar, String hub, String dest, String[][] roads) {
        answer = 0;
        Map<String,Integer> cityNumbers = new HashMap<>();
        setCityNumber(roads, cityNumbers);
        int start = cityNumbers.get(depar);
        int middle = cityNumbers.get(hub);
        int end = cityNumbers.get(dest);
        int[][] graph = setGraph(roads, cityNumbers);
        long startToMiddle = getAllPath(start,middle,graph);
        long middleToEnd = getAllPath(middle,end,graph);

        return (int) ((startToMiddle * middleToEnd) % 10007);
    }

    private void setCityNumber(String[][] roads, Map<String, Integer> cityNumbers) {
        int count = 0;
        for (String[] road : roads) {
            if(!cityNumbers.containsKey(road[0])) {
                cityNumbers.put(road[0], count);
                count++;
            }
            if(!cityNumbers.containsKey(road[1])) {
                cityNumbers.put(road[1], count);
                count++;
            }
        }
    }

    public int[][] setGraph(String[][] roads, Map<String, Integer> cityNumbers) {
        int[][] graph = new int[cityNumbers.size()][cityNumbers.size()];
        for (String[] road : roads) {
            graph[cityNumbers.get(road[0])][cityNumbers.get(road[1])] = 1;
        }
        return graph;
    }

    public int getAllPath(int start, int end, int[][] graph) {
        dfs(start, end, graph);
        int result = answer;
        answer = 0;
        return result;
    }

    public void dfs(int start,int end,int[][]graph){
        boolean[] visit = new boolean[graph.length];
        visit[start] = true;

        if(start == end){
            answer++;
            return;
        }

        for(int i=0;i<graph.length;i++){
            if(graph[start][i]==1 && !visit[i]){
                dfs(i,end,graph);
                visit[i]=false;
            }
        }
    }

}
