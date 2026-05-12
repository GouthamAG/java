package src.practice.CodingPracticeCompanies.Basic;

import java.util.Scanner;

public class FindSingleDigitSum {
    
    public static int getDigitSum(int tempInteger){
        int sumOfDigits = 0;
        int reminder;

        while (tempInteger > 0) {
            reminder = tempInteger % 10; // add last digit directly
            sumOfDigits += reminder; 
            tempInteger /= 10;                // remove last digit
        }
        
        return sumOfDigits;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputInteger = scn.nextInt();
        scn.close();

        int digitSum = getDigitSum(inputInteger);
        while(digitSum>9){
            digitSum = getDigitSum(digitSum);
        }
        
        System.out.println(digitSum);
        
    }
}
