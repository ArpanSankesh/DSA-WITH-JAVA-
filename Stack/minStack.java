package Stack;

import java.util.Scanner;
import java.util.Stack;

public class minStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value " + (i+1) + " : ");
            st.push(sc.nextInt());
        }

        System.out.println(st);
        minValue(st);
        sc.close();

    }

    public static void minValue(Stack<Integer> s) {
        Stack <Integer> tempStack = new Stack<>();


    }
}
