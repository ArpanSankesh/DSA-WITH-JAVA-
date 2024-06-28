package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 9, 1, -2, 4, 5, 11, -6, 7, 5};
        System.out.println("Given array : " + Arrays.toString(arr));
        System.out.print("Enter the Value of K: ");
        int k = sc.nextInt();
        boolean pairExists = pairSum(arr, k);
        sc.close();

        if (pairExists) {
            System.out.println("There exists a pair with sum " + k);
        } else {
            System.out.println("No pair with sum " + k + " found");
        }
    }

    public static boolean pairSum(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k - a;

            if (a != b && hm.containsKey(b)) {
                return true;
            } else if (a == b && hm.get(b) > 1) {
                return true;
            }
        }
        return false;
    }
}
