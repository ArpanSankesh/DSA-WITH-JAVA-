// package Arrays;

import java.util.*;

public class countGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];   //creating array
        
        for(int i=0; i < arr.length; i++){         //taking input
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
        }
        int count = count(arr);
        System.out.println("Number of elements having greater element than itself : " + count);
        sc.close();
    }

    public static int count(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } 
        }
        int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == max){
                    count++;
                }
            }
            return arr.length - count;

    }
}
