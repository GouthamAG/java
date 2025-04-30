package src.practice.basic;

public class SwapNum {
    public static void main(String[] args){
        int a = 5;
        int b = 12;

        System.out.println("Before Swapping, a = " + a + " b : " + b);

        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println("After Swapping, a = " + a + " b : " + b);
    }
}

//  a   b
//  5  12 
//  b = a + b = 5 + 12 = 17
//  a = b - a = 17 - 5 = 12
//  b = b - a = 17 - 12 = 5 
//
//
//
//
//
//
//
