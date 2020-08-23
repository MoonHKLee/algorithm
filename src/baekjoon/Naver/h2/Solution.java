package baekjoon.Naver.h2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String[] id_list, int k) {
        List<Customer> customers = new ArrayList<>();
        int answer=0;
        for (String value : id_list) {
            //당일쿠폰 초기화
            clear(customers);
            String[] arr = value.split(" ");
            for (String s : arr) {
                //logic
                if (isFirst(s, customers)) {
                    customers.add(new Customer(s, 1,true));
                    answer++;
                    System.out.println(s);
                } else {
                    if (customers.get(getIndex(s, customers)).count<k && !customers.get(getIndex(s, customers)).isTake){
                        customers.get(getIndex(s, customers)).count++;
                        customers.get(getIndex(s, customers)).isTake=true;
                        answer++;
                        System.out.println(s);
                    }
                }
            }
        }
        return answer;
    }

    public Boolean isFirst(String name,List<Customer> list){
        for (Customer customer : list) {
            if (customer.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public int getIndex(String name,List<Customer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void clear(List<Customer> list){
        for (Customer customer : list) {
            customer.isTake = false;
        }
    }
}

class Customer{
    String name;
    int count;
    Boolean isTake;

    public Customer(String name, int count,Boolean isTake) {
        this.name = name;
        this.count = count;
        this.isTake = isTake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
