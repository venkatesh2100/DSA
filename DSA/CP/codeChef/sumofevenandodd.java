package Codechef;

import java.util.Scanner;

public class sumofevenandodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumofeven(n);

    }
    public static void sumofeven(int n){
        //add even
        int evnres=0;
        int oddres=0;
        while(n>0){
            rem=n%10;
            if(rem%2==0){
                evnres=evnres+rem;
            }else {
                oddres=oddres+rem;
            }
            n=n/10;
        }
        System.out.println(evnres);
        System.out.println(oddres);
    }
}
