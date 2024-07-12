import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter Valuse of  a : ");
        int a = sc.nextInt();

        int pow = pow(a,n);
        System.out.println("Power is : " + pow);
        sc.close();
    }

    // public static int pow(int a, int n){

    // }
}