package src.practice.collections;

import java.util.ArrayList;

public class ArrayListCPractice {
    
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("Geeks");
        a.add("Geeks");
        a.add(1, "For");

        a.remove(0);
        a.removeLast();
        a.set(0, "GFG");
        System.out.println(a.get(0));
    }
}

