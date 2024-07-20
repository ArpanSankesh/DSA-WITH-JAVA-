package BinarySearch;

import java.util.*;

public class findFoor {
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

        int ans = floor(arr, k);
        System.out.println("Floor value of " + k + " is " + ans);

        sc.close();
    }

    public static int floor(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                return k;
            } else if (arr[mid] < k) {
                low = mid + 1;
                ans = arr[mid];
            } else {

                high = mid - 1;
            }
        }
        return ans;
    }
}
