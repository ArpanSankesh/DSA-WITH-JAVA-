package DynamiProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class dpIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

       int result = fib(n, dp);
       System.out.println("Fibonacci number at position " + n + " is: " + result);
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
