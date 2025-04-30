//https://www.geeksforgeeks.org/java-program-to-print-right-triangle-star-pattern/

package src.practice.basic.pattern;

import java.util.Scanner;

public class RightTriangleStar {
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer n = scn.nextInt();
        scn.close();
        

        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            if(i < n-1){
                System.out.println("");    
            }
        }
    }
}
