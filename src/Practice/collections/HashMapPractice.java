package src.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.put(2, "two");

        map.remove(3);

        map.put(4, "Four");

        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
