package HashMaps;

import java.util.HashMap;

public class hashmapIntro {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(10,50);
        hm.put(20,100);
        hm.put(30,150);
        hm.put(40,200);



        // System.out.println(hm.get(10));
        // System.out.println(hm.get(20));
        // System.out.println(hm.get(30));
        // System.out.println(hm.get(40));
        
        
        // System.out.println(hm.containsKey(40));
        
        // hm.remove(40);
        
        // System.out.println(hm.containsKey(40));
        // System.out.println(hm.get(40));

        System.out.println( "Size of the HashMap " + hm.size());

        for( int val: hm.keySet()){
            System.out.println(val + " , " + hm.get(val));
        }

       
    }
}
