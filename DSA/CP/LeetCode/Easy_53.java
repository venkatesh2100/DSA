package Leetcode;

public class Easy_53 {
    public int maxSubArray(int[] nums) {
        //discard the -ve Sign
        int max=0;
        int sum=Integer.MIN_VALUE;
        int len=nums.length;
        for(int i=0;i< len;i++){
            max+=nums[i];
            if(max>sum){
                sum=max;
            }if(max<0){
                max=0;
            }
        }
        return sum;

    }
}
