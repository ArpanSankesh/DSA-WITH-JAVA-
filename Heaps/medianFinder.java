package Heaps;

import java.util.*;

public class medianFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

       

        sc.close();
    }
}
