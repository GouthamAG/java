package src.practice.string;

import java.util.HashMap;
import java.util.Map;

public class temp {
    
    public static void main(String[] args) {
        
        Map<Character, Integer> hashMap = new HashMap<>();
        String tempString = "Gouthaaam";

        String tempStringCaps = tempString.toUpperCase();

        String vowelString = "AEIOU";

        for(int i=0; i<tempStringCaps.length(); i++){
            Character ch = tempStringCaps.charAt(i);
            if(vowelString.indexOf(ch) != -1){
                if (hashMap.containsKey(ch)){
                    int count = hashMap.get(ch);
                    count++;
                    hashMap.put(ch, count);
                } else {
                    hashMap.put(ch, 1);
                }
            }
        }

        for(Map.Entry<Character,Integer> e: hashMap.entrySet()){
            System.out.print(e.getKey() + ":" + e.getValue() + ",     ");
        }
        System.out.print("\n");
    }
    
}
