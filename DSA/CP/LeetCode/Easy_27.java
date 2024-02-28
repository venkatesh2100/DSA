package Leetcode;

public class Easy_27 {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        int[] ans=new int[len];
        /*
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
         */
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                ans[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<len;i++){
            ans[index]= Integer.parseInt("_");
        }
        for(int num:ans){
            System.out.print(num+" ");
        }

        return index;

    }
}
