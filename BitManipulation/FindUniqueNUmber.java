package BitManipulation;

import java.util.Scanner;

public class FindUniqueNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Elements " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        int unique = Unique(arr, size);
        System.out.println("Unique NUmber is : " + unique);
        sc.close();
    }

    public static int Unique(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

}
