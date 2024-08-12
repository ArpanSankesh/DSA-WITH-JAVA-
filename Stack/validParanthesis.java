package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string of Parenthesis '( )' '{ }' ''[ ] : ");
        String s = sc.nextLine();

        System.out.print("Your String : " + s);

        checkValidParenthesis(s);
        sc.close(); 
    }
    public static Boolean checkValidParenthesis(String s){
        Stack <Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(st.size() == 0 ){
                st.push(s[i]);
                continue;
            }
            if(s[i] == '(' || s[i] == '{' || s[i] == '['){
                st.push(s[i]);

            }else{
                if (s[i] == ')' ) {
                 if (st.peek() = ')') {
                    st.pop()
                 }else{
                    return false;
                 }
                }

                if (s[i] == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    }else{
                        return false;
                    }
                }

                if (s[i] == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    }else{
                        return false;
                    }
                }
                
            }
            if (st.size() == 0) {
                return true;
            }else{
                return false;
            }

        }
    }
}
