package Leetcode;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Easy_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        return nums[2];


    }
}
