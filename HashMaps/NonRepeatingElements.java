package HashMaps;

import java.util.HashMap;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {5,4,4,3,6,7,5,6};
        int frequency = findFrequency(arr);
        System.out.println(frequency);
    }

    public static int findFrequency(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i< arr.length; i++ ){
            if (hm.containsKey(arr[i]) == true) {
                int val = hm.get(arr[i]);
                hm.put(arr[i],val + 1 );
            }else{
                hm.put(arr[i],1);
            }
        }

        for(int i = 0; i< arr.length; i++){
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return - 1;
    }
}
