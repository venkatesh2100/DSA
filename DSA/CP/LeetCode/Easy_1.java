package Leetcode;

public class Easy_1 {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] output=new int[2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++) {
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                }

            }
        }
        return output;

    }
}
