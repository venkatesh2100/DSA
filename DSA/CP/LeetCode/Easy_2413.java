package Leetcode;

public class Leet_2413 {
    class Solution {
        public int smallestEvenMultiple(int n) {
            if(n%2==0){
                return n;
            }else{
                n*=2;
                return smallestEvenMultiple(n);
            }
        }
    }
}
