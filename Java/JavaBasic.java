import java.util.*;

public class JavaBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print(" ");
            }
            for( int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
}