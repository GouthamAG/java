package src.practice.string;

import java.util.ArrayList;

public class GetAllSubString {
    public static void main(String[] args) {
        String str = "The Cat";

        ArrayList<String> subStringsList = new ArrayList<String>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                subStringsList.add(str.substring(i, j));
            }
        }

        int count = 1;
        for(String it: subStringsList){
            System.out.println("(" + count + ")" + " : " + it);
            count++;
        }
    }
}
