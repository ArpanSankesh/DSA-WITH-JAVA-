
import java.util.Scanner;

public class fibonaaacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number N : ");
        int n = sc.nextInt();

        int answer = fibo(n);
        System.out.println("Your fibonaaci at " + n + "th : " + answer);
        sc.close();
    }

    public static int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int temp1 = fibo(n - 1);
        int temp2 = fibo(n - 2);

        return temp1 + temp2;
    }
}
