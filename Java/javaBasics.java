import java.util.*;

public class javaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        int radius = sc.nextInt();

        float area = 3.14f * radius * radius;

        System.out.println("Area of Circle is : " + area);

        
        
    }
}