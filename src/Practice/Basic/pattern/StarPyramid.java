package src.practice.basic.pattern;
import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer n = scn.nextInt();
        scn.close();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}