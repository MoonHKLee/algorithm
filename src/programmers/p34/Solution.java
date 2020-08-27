package programmers.p34;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("0110"));
    }

    public int solution(String numbers) {
        List<Integer> answer = new ArrayList<>();
        int[] arr = new int[numbers.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(numbers.charAt(i));
        }

        int n = numbers.length();
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        StringBuilder builder = new StringBuilder(numbers);
        for (int i = 0; i < numbers.length(); i++) {
            builder.replace(i,i+1,"9");
        }
        int[] prime = getPrime(Integer.parseInt(builder.toString()));
        prime[1] = 0;

        for (int i = 1; i <= numbers.length(); i++) {
            List<String> answer2 = new ArrayList<>();
            permutation(arr, output, visited, 0, n, i, answer2);
            for (String s : answer2) {
                if(s.equals("")){
                   continue;
                }
                int number = Integer.parseInt(s);
                if(prime[number] != 0) {
                    if(!answer.contains(number)) {
                        answer.add(number);
                    }
                }
            }
        }

        return answer.size();
    }

    //순열
    //사용 예시: permutation(arr, output, visited, 0, n, 3, answer);
    void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, List<String> answer) {
        if (depth == r) {
            permPrint(output, r, answer);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r, answer);
                visited[i] = false;
            }
        }
    }

    public int[] getPrime(int size) {
        int[] number = new int[size];

        for(int i=2; i < size; i++) {
            number[i] = i;
        }

        for(int i=2; i <= Math.sqrt(size); i++) {
            if(number[i]==0) continue;

            for(int j= 2 * i; j < size; j += i) {
                number[j] = 0;
            }
        }
        return number;
    }

    //순열 출력
    void permPrint(int[] arr, int r, List<String> answer) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < r; i++) {
            StringBuilder append = str.append(arr[i]);
            for (int j = 0; j < append.length(); j++) {
                if (append.charAt(0)=='0'){
                    append.deleteCharAt(j);
                }else{
                    break;
                }
            }
            if(answer.contains(append.toString())) {
                return;
            }
        }
        answer.add(str.toString());
    }
}
