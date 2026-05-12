package src.practice.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>(20,0.5f);

        hs.add("Goutham");
        hs.add("A G");
        hs.add("27");
        hs.add("DummyValue");

        hs.remove("DummyValue");

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
