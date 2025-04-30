package src.practice.arraynandstring;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scn.next();
        String resultString = "";

        for(int i=inputString.length()-1;i>=0;i--){
            char ch = inputString.charAt(i);
            String tempString = Character.toString(ch);
            resultString = resultString.concat(tempString);
        }

        System.out.println("Reversed String = " + resultString);

        scn.close();
    }
}



// package src.Practice.ArraynAndString;

// import java.util.Scanner;

// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a string");
//         String inputString = scn.next();
//         StringBuilder resultString = new StringBuilder();

//         for(int i=inputString.length()-1;i>=0;i--){
//             resultString = resultString.append(inputString.charAt(i));
//         }

//         System.out.println("Reversed String = " + resultString);
//     }
// }
