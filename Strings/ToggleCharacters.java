package Strings;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        sc.nextLine();

        char[] ch = new char[n];

        System.out.print("Enter a String : ");
        String st = sc.nextLine();

        for (int i = 0; i < n; i++) {
            ch[i] = st.charAt(i);
        }

        System.out.println("Original String : " + st.substring(0, n));
        toggle(ch);
        System.out.println("String After Toggle : " + new String(ch));
        toLowerCase(ch);

        sc.close();

    }

    public static void toggle(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }

    public static String toLowerCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }
}
