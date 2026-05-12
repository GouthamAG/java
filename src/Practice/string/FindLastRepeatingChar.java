package src.practice.string;

import java.util.Arrays;
import java.util.Scanner;

public class FindLastRepeatingChar {
    
    public static Character findLastRepeatingChar(String str){
        int [] counts = new int[26];
        Arrays.fill(counts, 0);
        for(int i=str.length()-1; i>=0; i--){
            if(counts[str.charAt(i)-'a']==1){
                return str.charAt(i);
            } else {
                counts[str.charAt(i)-'a']++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println("Last Repeating chars in string : " + findLastRepeatingChar(str));

    }
}
