package programmers.p31;

import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        int[] distinct = Arrays.stream(nums).distinct().toArray();
        return Math.min(distinct.length, nums.length / 2);
    }
}
