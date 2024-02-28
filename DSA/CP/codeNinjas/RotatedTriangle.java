package CodeNinjas;

public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        //    *       1
//            **      2
//            ***     3
//            **      2
//            *       1
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int s=0;s<n-i-1;s++){
                System.out.println(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n-2;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int s=0;s<i+1;s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
