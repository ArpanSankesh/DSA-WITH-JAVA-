import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int factor = factors(n);
        System.out.println("Factors of " + n + " is " + factor );
    }

    public static int factors(int n){
        int count = 0;
        for(int i = 1; i*i <= n; i++ ){
            if (n % i == 0 ){
               if (i != n/i){
                count = count + 2;
               }else{
                count = count + 1;
               }
                
            }
        }
        return count;
    }

}