package src.practice.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner scn = new Scanner(System.in);
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            scn.close();
            
            if(n2 == 0){
                throw new ArithmeticException("/ by zero");
            }
            
            System.out.println(n1/n2);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            e.printStackTrace();

        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}

/*
100
0
java.lang.ArithmeticException: / by zero
/ by zero
class java.lang.ArithmeticException
java.lang.ArithmeticException
 */

