import java.util.Scanner;

public class TwoDArrayFunction {
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
        System.out.println( arr[0][0]);
        fun(arr);
        System.out.println( arr[0][0]);

        sc.close();
    }

    public static void fun(int[][] arr){
        arr[0][0] = 1000;
    }
}
