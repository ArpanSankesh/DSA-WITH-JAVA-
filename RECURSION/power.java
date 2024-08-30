
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
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }
}

// import java.math.BigInteger;
// import java.util.Scanner;
// public class power {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Value of a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter value of n : ");
//         int n = sc.nextInt();
//         BigInteger pow = pow(BigInteger.valueOf(a), n);
//         System.out.println("Power is : " + pow);
//         sc.close();
//     }
//     public static BigInteger pow(BigInteger a, int n) {
//         if (n == 1) {
//             return a;
//         }
//         BigInteger temp = pow(a, n / 2);
//         if (n % 2 == 0) {
//             return temp.multiply(temp);
//         } else {
//             return temp.multiply(temp).multiply(a);
//         }
//     }
// }
