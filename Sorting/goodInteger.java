package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class goodInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element  " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        int gInt = gInt(arr);
        System.out.println( "There are " + gInt + " Good Integers");

        sc.close();
    }

    public static int gInt(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int lessCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if ( i == 0 || arr[i] != arr[i-1]) {
                lessCount = i;
            }
            if(arr[i] == lessCount){
                count++;
            } 
        }

        return count;
    }
}
