//Print sum of first N natual Numbers 
import java.util.*;

public class javaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = 0 ;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of " + n + " is " + sum);
    }
}