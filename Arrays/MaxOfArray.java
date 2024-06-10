package Arrays;

import java.util.Scanner;

public class MaxOfArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];   //creating array
        
        for(int i=0; i < arr.length; i++){         //taking input
            System.out.print("Enter a value : ");
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++){         //sum of array
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max of Array : " + max);   //printing sum of array
        sc.close();
    }
}
