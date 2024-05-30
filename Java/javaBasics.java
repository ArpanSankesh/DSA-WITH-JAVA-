import java.util.*;

public class javaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");  
        int A = sc.nextInt();
        System.out.print("Enter B : ");  
        int B = sc.nextInt();
        System.out.print("Enter C : ");  
        int C = sc.nextInt();
        if ((A >= B) && ( A >= C)){
            System.out.print("A is Greater : " + A);
        } else if (B >= C) {
            System.out.print("B is Greater : " + B);
        } else{
            System.out.print("C is Greater : " + C);
        }      
    }
}