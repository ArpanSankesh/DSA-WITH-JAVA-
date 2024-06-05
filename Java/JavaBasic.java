// Functions
import java.util.*;

public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        table(n);
    }
    
    public static void table(int n) {
        // int ans = 1;
        for (int i = 1; i <= 10; i++) {
            int ans = n * i;
            System.out.println( n + " X " + i + " = " + ans);
        }
    }

}