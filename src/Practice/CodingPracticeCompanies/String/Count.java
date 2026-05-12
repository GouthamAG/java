package src.practice.CodingPracticeCompanies.String;

import java.util.HashMap;
import java.util.Map;

public class Count {
    
    public static void main(String[] args) {
        
        // Count no of words
        String sentence = "This is   Goutham A G";
        String[] words = sentence.split(" ");
        
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println("\n\n\n");
        // This
        // is


        // Goutham
        // A
        // G



        // Count no of words ignore all black spaces
        words = sentence.split("\\s+");
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
        // This
        // is
        // Goutham
        // A
        // G




        //count no of characters
        int countOfChars = 0;
        for(int i=0; i<sentence.length(); i++){
            Character ch = sentence.charAt(i);
            if(ch != ' '){
                countOfChars++;
            }
        }
        System.out.println("countOfChars : " + countOfChars);



        //count no of repeated words ignoring cases using manual way
        String sentence2 = "Greed is GOOD and GREED is Progress";
        sentence2 = sentence2.toLowerCase();

        words = sentence2.split(" ");
        boolean[] visited = new boolean[words.length];

        for(int i=0; i<words.length; i++){
            if(visited[i]){
                continue;
            } else {
                visited[i] = true;
                int count = 1;

                for(int j=i+1; j<words.length; j++){
                    if(words[j].equals(words[i])){
                        visited[j] = true;
                        count++;
                    }
                }

                System.out.println(words[i] + " : " + count);
            }
        }


        //count no of repeated words ignoring cases using HashMap
        sentence2 = "Greed is GOOD and GREED is Progress";
        sentence2 = sentence2.toLowerCase();

        Map<String, Integer> wordFreqMap = new HashMap<>();
        words = sentence2.split(" ");
        
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(wordFreqMap.containsKey(words[i])){
                count = wordFreqMap.get(words[i]);
                count++;
                wordFreqMap.put(words[i], count);
            } else {
                wordFreqMap.put(words[i], 1);
            }
        }

        for(Map.Entry<String, Integer> e: wordFreqMap.entrySet()){
            System.out.println("Word: " + e.getKey() + "-------> Frequency: " + e.getValue());
        }

    }
}
