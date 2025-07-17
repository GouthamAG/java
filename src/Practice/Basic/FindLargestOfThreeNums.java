package src.practice.basic;

import java.util.Scanner;

public class FindLargestOfThreeNums {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first Integer");
        Integer num1 = scn.nextInt();
        System.out.println("Enter second Integer");
        Integer num2 = scn.nextInt();
        System.out.println("Enter third Integer");
        Integer num3 = scn.nextInt();

        // if(num1 > num2){
        //     if(num1 > num3){
        //         System.out.println(num1+" is the largest number");
        //     } else {
        //         System.out.println(num3+" is the largest number");
        //     }
        // } else if(num2 > num3){
        //     System.out.println(num2+" is the largest number");
        // } else {
        //     System.out.println(num3+" is the largest number");
        // }

        
        Integer result = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println(result+" is the largest number");
    }
}
