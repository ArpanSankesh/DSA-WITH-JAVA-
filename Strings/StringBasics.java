package Strings;

import java.util.*;

public class StringBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine();
        System.out.print("Enter a Character : ");
        char ch = sc.nextLine().charAt(0);

        System.out.println(st);
        System.out.println(ch);
        sc.close();
    }

}
