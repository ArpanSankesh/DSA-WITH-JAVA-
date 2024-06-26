package BitManipulation;
import java.util.Scanner;

public class FindUniqueNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter the Elements of the Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
    }

}
