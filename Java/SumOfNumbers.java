import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int Nsum = nautralSum(n);
        int WSum = wholeSum(n);
        System.out.println("Sum of " + n + " Nautral Number is : " + Nsum);
        System.out.println("Sum of " + n + " Whole Number is : " + WSum);
        sc.close();

    }

    public static int nautralSum(int n) {

        int calc = n * (n + 1) / 2;
        return calc;
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        // sum = sum + i;
        // }
        // return sum;
    }

    public static int wholeSum(int n) {

        int calc = n * (n - 1) / 2;
        return calc;
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum = sum + i;
        // }
        // return sum;
    }
}
