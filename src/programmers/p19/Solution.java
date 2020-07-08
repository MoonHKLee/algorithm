package programmers.p19;

class Solution {
    int isCap = 1;
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        int i = 0;
        while(i!=s.length()){
            if(isTarget(s.charAt(i))){
                if(isCap == 1){
                    builder.append(upper(s.charAt(i)));
                    change();
                }else{
                    builder.append(lower(s.charAt(i)));
                    change();
                }
                count++;
            }else{
                builder.append(s.charAt(i));
                isCap = 1;
                count = 0;
            }
            i++;
        }
        return builder.toString();
    }

    //현재 문자를 대문자로 반환하는 함수
    public char upper(char c){
        if(c<=122 && c>=97){
            c = (char)(c-32);
        }
        return c;
    }

    //현재 문자를 소문자로 반환하는 함수
    public char lower(char c){
        if(c>=65 && c<=90){
            c = (char)(c+32);
        }
        return c;
    }
    //홀짝 스위치
    public void change(){
        this.isCap = 1 - this.isCap;
    }

    public boolean isTarget(char c){
        if(( c >= 65 && c <= 90 ) || ( c >= 97 && c <= 122 )){
            return true;
        }
        return false;
    }
}
