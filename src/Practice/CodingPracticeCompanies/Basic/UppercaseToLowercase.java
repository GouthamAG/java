package src.practice.CodingPracticeCompanies.Basic;

import java.text.ListFormat.Style;
import java.util.Scanner;

public class UppercaseToLowercase {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        StringBuilder sbr = new StringBuilder();
        scn.close();

        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            } else{
                ch = Character.toUpperCase(ch);
            }

            sbr.append(Character.toString(ch));
        }

        System.out.println(sbr);

    }
}


