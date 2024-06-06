// Calculate nCr using Function
import java.util.*;

public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter Value of r : ");
        int r = sc.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n-r);

        int nCr = nfact / (rfact * nrfact);

        System.out.println(nCr);

        
    }
    
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
             ans = ans * i;
        }
        return ans;
    }

}