package Arrays;

import java.util.Arrays;

public class ReversePart {
    public static void main(String[] args) {
        int[] arr = { -3, 4, 2, 8, 3, 9, 6, 2, 8, 10 };

        int s = 3;
        int e = 7;

        reverse(arr, s, e);
        System.out.println(Arrays.toString(arr));
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
