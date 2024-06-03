// DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLE OF 10
import java.util.*;

public class javaBasics {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       do{
           System.out.print("Enter the Number : ");
           int n = sc.nextInt();
           if (n%10 == 0){
            System.out.println("Entered number is a Multiple of 10");
            continue;
           }
           System.out.println(n + " is not a Multiple of 10");
       }while(true);
        
    }
}