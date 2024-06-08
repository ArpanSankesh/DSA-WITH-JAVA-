package Arrays;
// import java.util.*;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            
            System.out.print("Enter value " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[2]);
        sc.close();
    }
}
