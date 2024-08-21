
import java.util.*;

public class ArrayIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print("Enter value " + i + " : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }

}
