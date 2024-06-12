package Strings;

import java.util.*;

public class StringBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine();
        System.out.print("Enter a Character : ");
        char ch = sc.nextLine().charAt(0);

        System.out.println( "Your String : "+ st);
        System.out.println( "Your Character : "+ ch);
        


        System.out.print("Enter a String to get the character : ");
        String str = sc.nextLine();

        System.out.println("Your Character at index 2 : " + str.charAt(2));

        
        sc.close();
    }

}
