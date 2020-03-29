package EST3;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String S, String C){
        String arr[]= S.split(";");
        List<Data> list2= new ArrayList<>();
        List<Data> distincted= new ArrayList<>();
        List<Data> list3= new ArrayList<>();
        Arrays.stream(arr)
                .map(String::trim)
                .map(v->{
                    String [] name = v.split(" ");
                    return name[name.length-1].toLowerCase()+"_"+name[0].toLowerCase();
                })
                .forEach(v->list2.add(new Data(0,v)));
        distincted = list2.stream().distinct().collect(Collectors.toList());
        for (Data data : list2) {
            if (!list3.contains(data)) {
                for (int i = 0; i < distincted.size(); i++) {
                    if (distincted.get(i).getName().equals(data.getName())){
                        distincted.set(i,new Data(distincted.get(i).getNumber()+1,distincted.get(i).getName()));
                    }
                }
                int index = 0;
                for (int i = 0; i < distincted.size(); i++) {
                    if (distincted.get(i).getName().equals(data.getName())){
                        index=i;
                    }
                }
                list3.add(distincted.get(index));
            }
        }
        List<String> answer = list3.stream()
                .map(v-> {
                    if (v.getNumber()!=1){
                        return " <"+v.getName()+v.getNumber()+"@"+C.toLowerCase()+".com"+">";
                    }else{
                        return " <"+v.getName()+"@"+C.toLowerCase()+".com"+">";
                    }
                })
                .collect(Collectors.toList());
        List<String> name = Arrays.stream(arr).map(String::trim).collect(Collectors.toList());
        for (int i = 0; i <answer.size() ; i++) {
            answer.set(i,name.get(i)+answer.get(i));
        }
        StringJoiner sj = new StringJoiner("; ");
        for (int i = 0; i < answer.size(); i++) {
            sj.add(answer.get(i));
        };
        return sj.toString();
    }
}

class Data{
    private int number;
    private String name;

    public Data(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//return v+" <"+name[name.length-1].toLowerCase()+"_"+name[0].toLowerCase()+"@"+C.toLowerCase()+".com"+">";