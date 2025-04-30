package src.practice.arraynandstring;

import java.util.Scanner;

public class Demo002 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int rows = scn.nextInt();

        System.out.println("Enter a number of columms");
        int columms = scn.nextInt();

        scn.close();

        int[][] array_2d =  new int[rows][columms];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columms; j++){
                array_2d[i][j] = (i+1) * (j+1);
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columms; j++){
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
