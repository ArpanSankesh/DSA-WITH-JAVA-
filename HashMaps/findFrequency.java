package HashMaps;

import java.util.*;

public class findFrequency {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int[] Q = { 2, 8, 3, 5 };

        frequency(arr, Q);

    }

    public static void frequency(int[] arr, int[] Q) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }

        }

        for (int i = 0; i < Q.length; i++) {
            int val = Q[i];
            if (hm.containsKey(val) == true) {
                System.out.println(val + " contains " + hm.get(val) + " times!");
            } else {
                System.out.println(val + " contaise 0 time !");
            }
        }

    }
}

// for(int i=0; i<Q.length; i++){
// int val = Q[i];
// int count = 0;
// for(int j=0; j<arr.length;j++){
// if (arr[j] == val) {
// count++;
// }
// }
// System.out.println(count);
// }