package src.practice.basic.pattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer n = scn.nextInt();
        scn.close();

        for(int i=0; i<n; i++){

            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            int num = i+1;
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num = num+1;
            }

            num = num-2;
            for(int j=0; j<i; j++){
                System.out.print(num+" ");
                num = num-1;
            }

            System.out.println("");
        }
    }
    
}
