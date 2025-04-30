package src.practice.basic;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number :");
        int first_num = scn.nextInt();

        System.out.println("Enter second number :");
        int second_num = scn.nextInt();

        int result = first_num + second_num;
        System.out.println("Result : " + result);

        scn.close();

    }    
}

