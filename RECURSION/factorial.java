import java.util.Scanner;

public class findSUm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Natural Number : ");
        int n = sc.nextInt();
        int sum = fact(n);
        System.out.println("The Sum of " + n + " number is : " + sum);
        sc.close();
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        int temp = fact(n-1);
        return n * temp;
    }
        
}
