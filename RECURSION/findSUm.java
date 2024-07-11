import java.util.Scanner;

public class findSUm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Natural Number : ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("The Sum of " + n + " number is : " + sum);
        sc.close();
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int temp = sum(n-1);
        return n + temp;
    }
        
}
