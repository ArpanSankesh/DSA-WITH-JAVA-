package HashMaps;

import java.util.*;

public class printDistinctElements {
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,30,30,40};

       int distintElem = distintElem(arr);
       System.out.println( "Number of Distinct Element in arr = " + Arrays.toString(arr) + " is " + distintElem);
     }
     
     public static int distintElem(int arr[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        return hs.size();
     }
}
