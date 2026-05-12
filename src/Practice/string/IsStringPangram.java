package src.practice.string;

import java.util.ArrayList;
import java.util.List;

public class IsStringPangram {

    public static void main(String[] args) {
     
        String inpuString = "abcdefgqwertyuiopasdfghjklzxcvbn,m";
        int[] charArray = new int[26];
        inpuString.toLowerCase();
        
        for(int i=0; i<inpuString.length(); i++){
            int index = inpuString.charAt(i)-'a';
            if(index>=0 && index<=25){
                charArray[index] = charArray[index] + 1;
            }
        }

        Boolean isPangram = true;
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] == 0){
                isPangram = false;
                System.out.println("Not a Pangram");
            }
        }

        if(isPangram){
            System.out.println("Pangram");
        }


    }
    
}



========================================================================
If interview is scheduled: till 28-OCt-2025
========================================================================
9AM to 1PM
Alternate Days
• Interview ques
• Coding ques

Alternate Days
2PM to 6:30PM
UI
API
Java Theory and Coding

8PM to 9PM
Job Prep

9PM to 9:30PM
Finance


========================================================================
If interview is not scheduled: 28-Oct-2025 to 8-Nov-2025
========================================================================
9AM to 1PM
2:30PM to 4:30PM
• GitHub Repo - All needed proper one GitHub Repo - UI Testing - Proper end-to-end workflow
        • Industry level standard
        • Proper testcases
        • Authentication
                ○ Java
                ○ Selenium
                ○ TestNG
                ○ BDD
                ○ Reporting
                ○ CI/CD


5PM to 6:30PM
Job Prep

8PM to 9PM
• Interview ques
• Coding ques

9PM to 9:3PM
Finance


========================================================================
If interview is not scheduled: 9-Nov-2025 onwards
========================================================================
9AM to 1PM
Job Prep

Alternate Days
2:30PM to 4:30PM
UI
API
Java Theory and Coding

5PM to 6:30PM
Business

8PM to 9PM
• Interview ques
• Coding ques

90PM to 9:3PM
Finance



