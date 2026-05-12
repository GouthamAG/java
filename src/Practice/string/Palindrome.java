package src.practice.string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = new String("abbcbbaa");
        Boolean flag = true;

        for(int i=0, j=str.length()-1; i<=j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Palindrome");
        }
        else if(!flag){
            System.out.println("Not Palindrome");
        }
    }
    
}
