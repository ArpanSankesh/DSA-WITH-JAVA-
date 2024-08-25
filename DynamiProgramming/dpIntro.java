package DynamiProgramming;

import java.util.Scanner;

public class dpIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter value " + " : ");
            dp[i] = sc.nextInt();
        }

        // System.out.print(Arrays.toString(n));
    }
    public static int fib(int n, int[] dp){
        
        if(n == 0 || n == 1){
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int a = fib(n-1, dp);
        int b = fib(n-2, dp);

        dp[n] = a+b;
        
        return a+b;

    }
}
