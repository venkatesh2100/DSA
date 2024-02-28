package Leetcode;

public class Easy_9 {
    class Solution {
        public boolean isPalindrome(int x) {
            //change into String
            String str1num=Integer.toString(x);
            int left=0;
            int right=str1num.length()-1;
            //Iterate the Loop
            while(left<right){
                if(str1num.charAt(left)!=str1num.charAt(right)){
                    return false;
                }else {
                    left++;
                    right--;
                }
            }
            return true;

        }
    }
}
