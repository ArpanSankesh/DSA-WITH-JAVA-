package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string of Parenthesis '( )' '{ }' ''[ ] : ");
        String s = sc.nextLine();

        System.out.println("Your String : " + s);

        Boolean result = checkValidParenthesis(s);

        if (result) {
            System.out.print("Yess! it is a Valid PArenthesis");
        } else {
            System.out.print("NO! it is NOT Valid PArenthesis");
        }
        
        sc.close();
    }

    public static Boolean checkValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if (st.size() == 0) {
                st.push(current);
                continue;
            }
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);

            } else {
                if (current == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                if (current == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                if (current == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
