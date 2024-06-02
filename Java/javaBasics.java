//Table for n number
import java.util.*;

public class javaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Table : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + n*i);
    }
}