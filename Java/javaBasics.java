// Check if a Number is prime or not 
import java.util.*;

public class javaBasics {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the Number : ");
       int n = sc.nextInt();

       if( n == 2){
        System.out.print(n + " is a Prime number");
       }else{
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++){
            if(n % i ==0 ){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.print(n + " is a Prime Number");
        }else{
            System.out.print(n + " is not a Prime Number");
        }
       }
        
    }
}