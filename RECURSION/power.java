import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of  a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        long pow = pow(a, n);
        System.out.println("Power is : " + pow);
        sc.close();
    }

    public static long pow(long a, long n) {
        if (n == 1) {
            return a;
        }
        long temp = pow(a, n / 2);
        if( n%2 == 0){
            return temp * temp;
        }else{
            return temp * temp * a;
        }
    }
}