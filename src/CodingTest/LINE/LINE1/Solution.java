package CodingTest.LINE.LINE1;

public class Solution {
    public int solution(String inputString){
        // <>
        int a = 0;
        // {}
        int b = 0;
        // []
        int c = 0;
        // ()
        int d = 0;

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i)=='<'){
                a++;
            }else if(inputString.charAt(i)=='>'){
                a--;
                if(a<0){
                    return -1;
                }
                count++;
            }else if(inputString.charAt(i)=='{'){
                b++;
            }else if(inputString.charAt(i)=='}'){
                b--;
                if(b<0){
                    return -1;
                }
                count++;
            }else if(inputString.charAt(i)=='['){
                c++;
            }else if(inputString.charAt(i)==']'){
                c--;
                if(c<0){
                    return -1;
                }
                count++;
            }else if(inputString.charAt(i)=='('){
                d++;
            }else if(inputString.charAt(i)==')'){
                d--;
                if(d<0){
                    return -1;
                }
                count++;
            }
        }
        if (a==0 && b==0 && c==0 && d==0){
            return count;
        }else{
            return -1;
        }
    }
}
