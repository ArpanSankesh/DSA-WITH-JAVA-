package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0; i < arr.length; i++){
            System.out.print("Enter a value : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array : " + sum);
        sc.close();
    }
    
} 