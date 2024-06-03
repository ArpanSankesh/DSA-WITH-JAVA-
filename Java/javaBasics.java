
// BREAK STATEMENT
import java.util.*;

public class javaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println(n + " is  Multiple of 10");
                break;
            }
            System.out.println(n +" is not Multiple of 10");
        } while (true);
    }
}