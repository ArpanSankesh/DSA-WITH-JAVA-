package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" String : ");

        String st = sc.nextLine();

        System.out.println("Orignal String : " + st);

        String st2 = removeAdj(st);
        System.out.println("After Removing Adjacent : " + st2);

        sc.close();

    }

    public static String removeAdj(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.size() == 0) {
                st.push(s.charAt(i));
            }

            if (st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        char[] arr = new char[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return new String(arr);
    }
}
