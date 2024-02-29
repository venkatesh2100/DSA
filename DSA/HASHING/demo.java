package DSA.HASHING;

import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Scan the Array
    System.out.println("Enter the Size of the Array and Elemets follows");
    int length = sc.nextInt();
    int arr[] = new int[length];
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }
    // Apply hashing for counting number of elements
    System.out.println("Enter the number to check How many time it is Printed:");
    int check = sc.nextInt();
    int count = 0;
    for (int num : arr) {
      if (num == check) {
        count++;
      }
    }
    System.out.println(check + " is repeated " + count+" times");
    sc.close();
  }

}
