// package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber of Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter NUmber of Columns : ");
        int m  = sc.nextInt();

        int[][] arr = new int[n][m];

        sc.close();
    }
    
}
