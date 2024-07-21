package BinarySearch;

import java.util.Scanner;

public class findUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        int ans = unique(arr);
        System.out.println("Unique Number in Array is " + ans);

        sc.close();
    }

    public static int unique(int arr[]) {
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        int low = 2;
        int high = arr.length - 3;

        while (low <= high) {
            int mid = (low - high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] == arr[mid - 1]) {
                mid--;
            }
            if (mid % 2 == 0) {
                low = mid - 2;
            } else {
                high--;
            }
        }
        return -1;
    }
}