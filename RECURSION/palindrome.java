import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Characters :");

        String input = sc.nextLine();

        char[] ch = input.toCharArray();

        boolean ans = isPalindrome(ch, 0, ch.length - 1);
        if (ans) {
            System.out.println("'" + input + "' is an Palindrome ");
        } else {
            System.out.println("'" + input + "' is an not Palindrome ");

        }
        sc.close();

    }

    public static boolean isPalindrome(char[] ch, int s, int e) {
        if (s == e || s > e) {
            return true;
        }

        if (ch[s] == ch[e]) {
            boolean temp = isPalindrome(ch, s + 1, e - 1);
            return temp;
        } else {
            return false;
        }
    }
}
