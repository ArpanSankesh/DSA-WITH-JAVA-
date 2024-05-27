// #if-else
import java.util.*;

public class javaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");  
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You Can Vote ! ");
        }else{
            System.out.println("Sorry you can't !");
        }
    }
}