// PrimeNumber
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.print(n + " : is a Prime Number!");
        } else {
            System.out.print(n + " : is not a Prime Number!");

        }

    }
 
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}