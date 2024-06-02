// print number from 1 to n 
import java.util.*;

public class javaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println("Number " + counter);
            counter++;
        }
        
        
    }
}