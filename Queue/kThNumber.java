package Queue;

import java.util.*;

public class kThNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of K : ");
        int k = sc.nextInt();

        String result = kthNumber(k);
        System.out.print("Value of K is  " + result);
        sc.close();

    }

    public static String kthNumber(int k) {

        Queue<String> q = new LinkedList<>();

        q.add("1");
        q.add("2");

        String ans = "";

        for (int i = 1; i <= k; i++) {
            String temp = q.remove();
            ans = temp;
            q.add(temp + "1");
            q.add(temp + "2");
        }
        return ans;
    }
}
