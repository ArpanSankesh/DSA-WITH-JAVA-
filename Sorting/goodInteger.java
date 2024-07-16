package Sorting;

import java.util.Scanner;

public class goodInteger {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of n : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    
    for(int i = 0; i < arr.length; i++){
        System.out.print("Enter Element  " + i + " : ");
        arr[i] = sc.nextInt();
    }

    sc.close();
   }

}
