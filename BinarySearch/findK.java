package BinarySearch;

import java.util.Scanner;

public class findK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K : ");
        int k = sc.nextInt();

        boolean ans = search(arr,k);
        System.out.println(ans);

        sc.close();
    }

    public static boolean search(int[] arr, int k){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == k) {
                return true;
            }else if (arr[mid] < k) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return false;
    }
    
}
