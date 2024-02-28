package Leetcode;

public class Medium_2240 {
    class Solution {
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            int res=0;
            //Results Updated Everytime
            while(total>=0){
                res+=(total/cost2)+1;
                total-=cost1;
            }
            return res;

        }
    }
}
