package Sorting;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumbersAndFindCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Element  " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int remove = remove(arr,n);
        System.out.println("Total cost of arr : "+ Arrays.toString(arr) + " is " + remove);
        sc.close();
    }

    public static int remove(int[] arr, int n){
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < n; i++){
            int temp = arr[i] * (n - i);
            ans = ans + temp;
        }
        return ans;

    }
}
