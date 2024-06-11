// Print Matrix in wave form 

import java.util.Scanner;

public class MatrixWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber of Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter NUmber of Columns : ");
        int m  = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++ ){
            for(int j = 0 ; j < m; j++ ){
                System.out.print("Enter value for element [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();  
        System.out.println("------------------------------");
        System.out.println("Your Wave Matrix is Array is ");
        for(int i = 0; i < n; i++ ){
            if(i%2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = m-1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
                }
            System.out.println();
            }
        System.out.println("------------------------------");
}
    
}