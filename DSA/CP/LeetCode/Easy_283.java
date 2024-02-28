package Leetcode;

public class Easy_283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            //if 0 occurs Append it to last of the Indexth  array
            int Index = 0;
            int len = nums.length;
            int[] ans = new int[len];
            //Loop to iterate the array to find Non zero Indexs
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    ans[Index] = nums[i];
                    Index++;
                }
            }
            for(int j=Index;j<len;j++){
                ans[Index]=0;
                Index++;
        }
            for(int num:ans){
                System.out.print(num+" , ");
            }

        }
    }

}
