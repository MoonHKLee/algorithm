package KaKao.t01;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("...!@Ba__T#* 123..y.abcdefghijklm."));
//        System.out.println(solution.solution("z-+.^."));
//        System.out.println(solution.solution("=.="));
//        System.out.println(solution.solution("123_.def"));
//        System.out.println(solution.solution("abcdefghijklmn.p"));
    }

    public String solution(String new_id) {
        String answer = change1(new_id);
        System.out.println(answer);
        answer = change2(answer);
        System.out.println(answer);
        answer = change3(answer);
        System.out.println(answer);
        answer = change4(answer);
        System.out.println(answer);
        answer = change5(answer);
        System.out.println(answer);
        answer = change6(answer);
        System.out.println(answer);
        answer = change7(answer);
        return answer;
    }

    public String change1(String new_id) {
        if(new_id.equals("")){
            return "";
        }
        return new_id.toLowerCase();
    }

    public String change2(String new_id) {
        StringBuilder builder = new StringBuilder();
        if(new_id.equals("")){
            return "";
        }
        for (int i = 0; i < new_id.length(); i++) {
            if(new_id.charAt(i)>=97 && new_id.charAt(i)<=122){
                builder.append(new_id.charAt(i));
            }
            if(new_id.charAt(i)>=48 && new_id.charAt(i)<=57){
                builder.append(new_id.charAt(i));
            }
            if(new_id.charAt(i)==45 || new_id.charAt(i)==46 || new_id.charAt(i)==95){
                builder.append(new_id.charAt(i));
            }
        }
        return builder.toString();
    }

    public String change3(String new_id) {
        if(new_id.equals("")){
            return "";
        }
        char check = ' ';
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            if(check == '.' && new_id.charAt(i)=='.') {
                continue;
            }else {
                check = new_id.charAt(i);
                builder.append(new_id.charAt(i));
            }
        }
        return builder.toString();
    }

    public String change4(String new_id) {
        if(new_id.equals("")){
            return "";
        }
        StringBuilder builder = new StringBuilder(new_id);
        if (new_id.charAt(0)=='.') {
            builder.deleteCharAt(0);
        }
        if(builder.length()==0) {
            return "";
        }
        if (builder.charAt(builder.length()-1)=='.') {
            builder.deleteCharAt(builder.length()-1);
        }
        return builder.toString();
    }

    public String change5(String new_id) {
        if(new_id.equals("")){
            return "a";
        }
        return new_id;
    }

    public String change6(String new_id) {
        StringBuilder builder = new StringBuilder(new_id);
        if(new_id.length()>=16) {
            builder.delete(15,new_id.length());
            if(builder.charAt(builder.length()-1)=='.') {
                builder.deleteCharAt(builder.length()-1);
            }
            return builder.toString();
        }
        return new_id;
    }

    public String change7(String new_id) {
        StringBuilder builder = new StringBuilder(new_id);
        while(builder.length()<=2) {
            builder.append(builder.charAt(builder.length()-1));
        }
        return builder.toString();
    }
}
