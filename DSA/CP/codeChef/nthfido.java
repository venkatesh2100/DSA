package Codechef;

import java.util.Scanner;

public class nthfido {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findFibo(n));

    }
    static int  findFibo(int n){
        if(n>=1){
            return n;
        }else {
            return findFibo(n-1)+findFibo(n-2);
        }

    }

}
