package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        sc.nextLine();

        char[] ch = new char[n];

        System.out.print("Enter a String : ");
        String st = sc.nextLine();

        for(int i = 0; i< n; i++){
            ch[i] = st.charAt(i);
        }
        System.out.println("Original String : " + st.substring(0, n));

        
        reverse(ch);

        System.out.println("Reversed String: " + new String(ch));


        sc.close();
    }

    public static void reverse(char[] ch) {
        int startPoint = 0;
        int endPoint = ch.length - 1;
        while (startPoint < endPoint) {
            char temp = ch[startPoint];
            ch[startPoint] = ch[endPoint];
            ch[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }

    // public static String reverse(String str){
    //     int n = str.length();

    //     char[] ch = str.toCharArray();
    //     int startPoint = 0;
    //     int endPoint = n - 1;
    //     while (startPoint < endPoint) {
    //         char temp = ch[startPoint];
    //         ch[endPoint] = ch[startPoint];
    //         ch[startPoint] = temp;
    //         startPoint++;
    //         endPoint--;
    //     }
    //     String ans = str.valueOf(ch);
    //     return ans;
    // }
}
