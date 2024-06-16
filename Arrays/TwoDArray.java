import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber of Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter NUmber of Columns : ");
        int m  = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int j = 0; j < m; j++ ){
            for(int i = 0 ; i  < n; i++ ){
                System.out.print("Enter value for element [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("------------------------------");
        System.out.println("Your 2D Array is ");
        for(int i = 0; i < m; i++ ){
            for(int j = 0 ; j < n; j++ ){
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                // System.out.println();
                }
            System.out.println("------------------------------");
    }
}
