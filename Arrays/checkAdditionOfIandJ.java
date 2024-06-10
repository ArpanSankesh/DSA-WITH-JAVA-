package Arrays;

import java.util.Scanner;

public class checkAdditionOfIandJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];   //creating array
        
        for(int i=0; i < arr.length; i++){         //taking input
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        boolean check = checkAdd(arr, k);

        
        if(check){
            System.out.println("YESS! \nThere is a pair with the sum K");
            }else{
            System.out.println("NOOO! \nThere is NO pair with the sum K");
        }

        sc.close();
    }

    public static boolean checkAdd(int[] arr, int k){
        
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
