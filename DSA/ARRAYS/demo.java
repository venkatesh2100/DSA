package DSA.ARRAYS;

import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    sc.close();
    for(int num:arr){
      System.out.println(num);
    }
  }
  
}
