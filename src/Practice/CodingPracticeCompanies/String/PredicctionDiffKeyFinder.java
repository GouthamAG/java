package src.practice.CodingPracticeCompanies.String;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class PredicctionDiffKeyFinder {
    
    public static List<String> findPredictionKeyDiff(Map<String, String> prediction1, Map<String, String> prediction2){

        List<String> resultList = new ArrayList<>();

        for(Map.Entry<String, String> e1: prediction1.entrySet()){
            String key1 = e1.getKey();
            String value1 = e1.getValue();

            if(prediction2.containsKey(key1)){
                String value2 = prediction2.get(key1);
                if(!Objects.equals(value1, value2)){
                    resultList.add(key1);
                }
            }
        }
        return resultList;
    }


    public static Map<String, String> parseSimpleMapString(String string1){
        Map<String, String> prediction1 = new HashMap<>();

        String cleanString = string1.substring(2, string1.length()-1);
        String [] pairs = cleanString.split(",");

        for(String pair:pairs){
            String [] keyValue = pair.split(":");
            String key = keyValue[0].trim().replaceAll("^\"|\"$", "");
            String value = keyValue[1].trim().replaceAll("^\"|\"$", "");
            prediction1.put(key, value);
        }

        return prediction1;
    }

    public static void main(String[] args) {

        String string1 = "{\"Hello\" : \"Hi\", \"Input\": \"Output\" , \"1\":\"One\", \"2\":\"Two\"}";
        Map<String, String> prediction1 = parseSimpleMapString(string1);
        
        String string2 = "{\"Hello\" : \"Hsfjvbb\", \"Input\": \"Output\" , \"1\":\"One\", \"2\":\"Twoooo\"}";
        Map<String, String> prediction2 = parseSimpleMapString(string2);


        List<String> resultList = findPredictionKeyDiff(prediction1, prediction2);
        
        if(resultList.isEmpty()){
            System.out.println("List is empty");
        } else {
            for(String item: resultList){
                System.out.println(item);
            }
        }
    }
}

