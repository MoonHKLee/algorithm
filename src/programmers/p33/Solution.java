package programmers.p33;

public class Solution {

    public String solution(String p) {
        if (isRight(p)) {
            return p;
        }
        StringBuilder builder = new StringBuilder(p);
        String u = "";
        String v = "";
        int num = 0;
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i)=='('){
                num++;
            }else if(builder.charAt(i)==')'){
                num--;
            }
            if(num==0){
                u = builder.substring(0, i + 1);
                v = builder.substring(i + 1, builder.length());
                break;
            }
        }

        if (isRight(u)) {
            return u + solution(v);
        }

        StringBuilder builder1 = new StringBuilder(u);
        builder1 = new StringBuilder(builder1.substring(1,u.length()-1));
        for (int i = 0; i < builder1.length(); i++) {
            if(builder1.charAt(i)=='('){
                builder1.replace(i,i+1,")");
            }else if (builder1.charAt(i)==')') {
                builder1.replace(i,i+1,"(");
            }
        }
        u = "(" + solution(v) + ")" + builder1.toString();

        return u;
    }

    public boolean isRight(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                num++;
            }else{
                num--;
            }

            if(num < 0) {
                return false;
            }
        }
        return true;
    }
}
