import java.util.*;

public class javaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");  
        int num = sc.nextInt();
        String check = (num%2 == 0 ) ? "Even": "Odd";
        System.out.println(check);
    }
}