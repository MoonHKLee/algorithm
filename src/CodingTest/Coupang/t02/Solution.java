package CodingTest.Coupang.t02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        String string = "01월 10일";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM월 dd일");
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
        System.out.println(date.format(formatter));
    }
}
