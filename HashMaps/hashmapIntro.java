package HashMaps;

import java.util.HashMap;

public class hashmapIntro {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(10,50);
        hm.put(20,100);
        hm.put(30,150);
        hm.put(40,200);


        hm.get(10);
        hm.get(20);
        hm.get(30);
        hm.get(40);
    }
}
