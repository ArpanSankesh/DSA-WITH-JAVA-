
// Function
import java.util.*;

public class JavaBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }

    public static int fact(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

}