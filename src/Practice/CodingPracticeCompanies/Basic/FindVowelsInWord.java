package src.practice.CodingPracticeCompanies.Basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindVowelsInWord {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inpuString = scn.next();
        scn.close();

        String vowels = "aeiouAEIOU";

        HashSet<Character> vowelSet = new HashSet<Character>();

        Set<Character> vowelSetInOrder = new LinkedHashSet<>();

        Map<Character, Integer> vowelMap = new HashMap<>();

        for(int i=0; i<inpuString.length(); i++){
            Character ch = inpuString.charAt(i);
            if(vowels.indexOf(ch) != -1){
                vowelSet.add(ch);
                vowelSetInOrder.add(ch);

                if(vowelMap.containsKey(ch)){
                    int count = vowelMap.get(ch);
                    vowelMap.put(ch, count+1);
                } else{
                    vowelMap.put(ch, 1);
                }
            }
        }

        // System.out.println(vowelSet);

        // Iterator<Character> it = vowelSet.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        System.out.print("Using HashSet --> ");
        for(char v: vowelSet){
            System.out.print(v + " ");
        }
        System.out.print("\n");

        System.out.print("Using LinkedHashSet --> ");
        for(char v: vowelSetInOrder){
            System.out.print(v + " ");
        }
        System.out.print("\n");

        System.out.print("Using HashMap --> ");
        for(Map.Entry<Character,Integer> e : vowelMap.entrySet()){
            System.out.print(e.getKey() + ":" + e.getValue() + ",     ");
        }
        System.out.print("\n");
    }
        
}


// Goutham23ooou       
// Using HashSet --> a u o 
// Using LinkedHashSet --> o u a 
// Using HashMap --> a:1,     u:2,     o:4,     