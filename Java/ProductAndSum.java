import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int sum = Sum(n);
        System.out.print(sum);
    }

    public static int Sum(int n){
        int sum = 0;
        int multi = 1;   
        while(n > 0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            multi = multi * lastDigit;
            n = n/10;
        }
        return multi - sum;        
    }
}
