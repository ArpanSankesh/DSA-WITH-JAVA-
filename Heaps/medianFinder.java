package Heaps;

import java.util.*;

public class medianFinder {

    PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> max = new PriorityQueue<>();

    public static void main(String[] args) {
        medianFinder mf = new medianFinder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            mf.addNum(arr[i]);
            System.out.println("Current median: " + mf.findMedian());
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public void addNum(int nums) {
        if (min.size() == max.size()) {
            max.add(nums);
            min.add(max.remove());
        } else {
            min.add(nums);
            max.add(min.remove());
        }
    }

    public double findMedian() {
        if (min.size() == max.size()) {
            return (min.peek() + max.peek()) / 2.0;
            
        } else {
            return min.peek() * 1.0;
        }
    }
}
