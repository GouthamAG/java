package src.practice.basic;

import java.util.Scanner;

public class EvenOrOdd{

    public static void main(String[] args) {
        
        System.out.println("Enter an Integer");
        Scanner scn = new Scanner(System.in);
        Integer num = scn.nextInt();
        scn.close();

        if(num%2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }

}