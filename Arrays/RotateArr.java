// package Arrays;
import java.util.*;
public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Arr : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Elements " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K : ");
        int k = sc.nextInt();

        k = k % n;

        System.out.println("Original Arr : " + Arrays.toString(arr));
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        
        System.out.println("Arr after Reverse : " + Arrays.toString(arr));
        sc.close();
    }

    public static void reverse(int[] arr, int s, int e) {
        int sp = s;
        int ep = e;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }

}
