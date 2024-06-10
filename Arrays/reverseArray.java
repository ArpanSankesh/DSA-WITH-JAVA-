package Arrays;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int[] arr = {10, 20 , 30 , 40 , 50};
    
        reverse(arr);  
        System.out.println(Arrays.toString(arr)); 
    }

    public static void reverse(int[] arr){
        int startPoint = 0;
        int endPoint = arr.length - 1;

        while(startPoint < endPoint){
            int temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;

            startPoint++;
            endPoint--;

        }

    }


}