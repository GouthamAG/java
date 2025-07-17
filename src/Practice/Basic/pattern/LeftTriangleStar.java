package src.practice.basic.pattern;

import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = scn.nextInt();
        scn.close();

        for(int i = 0; i < num; i++){

            for(int y=(num-i-1)*2; y>=1; y--){
                System.out.print(" ");
            }

            for(int y=0; y<=i; y++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
