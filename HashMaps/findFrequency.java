// package HashMaps;

// import java.util.*;

// public class findFrequency {
//     public static void main(String[] args) {

//         int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
//         int[] Q = { 2, 8, 3, 5 };

//         frequency(arr, Q);

//     }

//     public static void frequency(int[] arr, int[] Q) {
//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for (int i = 0; i < arr.length; i++) {
//             if (hm.containsKey(arr[i]) == true) {
//                 int temp = hm.get(arr[i]);
//                 hm.put(arr[i], temp + 1);
//             } else {
//                 hm.put(arr[i], 1);
//             }
//             System.out.println(temp);
//         }

//         // for(int i=0; i<Q.length; i++){
//         // int val = Q[i];
//         // int count = 0;
//         // for(int j=0; j<arr.length;j++){
//         // if (arr[j] == val) {
//         // count++;
//         // }
//         // }
//         // System.out.println(count);
//         // }
//     }
// }

package HashMaps;

import java.util.HashMap;

public class findFrequency {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int[] Q = { 2, 8, 3, 5 };

        frequency(arr, Q);
    }

    public static void frequency(int[] arr, int[] Q) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Calculate frequencies of each element in arr
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // Print frequencies of elements in Q
        for (int q : Q) {
            if (hm.containsKey(q)) {
                System.out.println(q + " appears " + hm.get(q) + " times");
            } else {
                System.out.println(q + " appears 0 times");
            }
        }
    }
}

