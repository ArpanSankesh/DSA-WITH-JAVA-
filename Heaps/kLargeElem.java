package Heaps;

import java.util.*;

public class kLargeElem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        kSmallElement(arr, k);
        sc.close();
    }

    public static void kSmallElement(int[] arr, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            PQ.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > PQ.peek()) {
                PQ.remove();
                PQ.add(arr[i]);
            }
        }
        while (!PQ.isEmpty()) {
            System.out.print(PQ.remove() + " ");
        }
    }
}
