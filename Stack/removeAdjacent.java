package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the Number of elements to remove : ");
        int r = sc.nextInt();
        Stack <Integer> st = new Stack<>();

        for (int i = 1; i <= n; i++) {
            st.add(i);
        }
        System.out.println( "Orignal Stack : " + st);
        
        for (int i = 0; i < r; i++) {
            st.pop();
        }
        System.out.println( "Stack after Popping : " + st);
        sc.close();

    }
}
