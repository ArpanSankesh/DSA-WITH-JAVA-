package Heaps;

import java.util.*;

public class medianFinder {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();
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

    public void addNum(int nums){
        if (left.size() == right.size()) {
            right.add(nums);
            left.add(right.remove());
        }else{
            left.add(nums);
            right.add(left.remove());
        }
    }

    public double findMedian(){
        if (left.size() == right.size()) {
            double ans = left.peek() + right.peek() / 2.0;
            return ans;
        }else{
            return left.peek() * 1.0;
        }
    }


}
