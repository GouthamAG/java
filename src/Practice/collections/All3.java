package src.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class All3 {
    
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        HashSet<String> hs = new HashSet<>();
    
        HashMap<Integer, String> hm = new HashMap<>();

        al.add(122);
        al.add(123);
        al.add(124);
        al.add(125);
        al.add(126);

        for(Integer i: al){
            System.out.println(i);
        }

        hs.add("One");
        hs.add("Two");
        hs.add("Three");

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");

        for(Map.Entry<Integer, String> e: hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


    }


}








