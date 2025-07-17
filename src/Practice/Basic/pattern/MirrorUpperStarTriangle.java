package src.practice.basic.pattern;

import java.util.Scanner;

public class MirrorUpperStarTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = scn.nextInt();
        scn.close();

        // Upper Triangle
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Lower Triangle
        for(int i=num-1; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
