package CodeNinjas;

public class UpperandlowerTriangle {
    public class Solution {
        public static void nStarDiamond(int n) {
            // Write your code here
            /**
             *      *          2 1 2   0 5 0
             *     * * *       1 3 1   1 3 1
             *    * * * * *    0 5 0   2 1 2
             */
            UpperTriangle(n);
            LowerTriangle(n);

        }
        public  static  void UpperTriangle(int n){
            for (int i=0;i<n;i++){
                for(int j=0;j<n-1-i;j++){
                    System.out.print(" ");
                }
                for (int s=0;s<2*i+1;s++){
                    System.out.print("*");
                }
                for(int j=0;j<n-1;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        public  static void  LowerTriangle(int n){
            //space
            for(int i=0;i<n-1;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
            //star
            for(int s=0;s<(2*n)-(2*i+1);s++){
                System.out.print("*");
            }
            //space
                for(int j=0;j<i;j++) {
                    System.out.print(" ");
                }
        }
    }
}
