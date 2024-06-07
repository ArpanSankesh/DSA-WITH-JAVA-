import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int ans = Square(n);
        System.out.println("Square Root of " + n + " is " + ans);
    }

    public static int Square(int n){
        int ans = 1;
        int i = 1;
        while(i*i <= n){
            ans = i;
            i++;
        }
        return ans;
    }
}
