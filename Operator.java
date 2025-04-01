package java;
public class Operator {
    
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("a : " + a++);
        System.out.println("a : " + ++a);    
        
        System.out.println("b : " + b--);
        System.out.println("b : " + --b);

        System.out.println("");

        a = 65;
        b = 5;
        int sum = b + ++a;
        System.out.println("sum : " + sum);
        System.out.println("a : " + a);

        System.out.println("");

        a = 65;
        b = 5;
        sum = b + a++;
        System.out.println("sum : " + sum);
        System.out.println("a : " + a);

        System.out.println("");

        a = 65;
        b = 5;
        sum = b + a++ + a;
        System.out.println("sum : " + sum);
        System.out.println("a : " + a);
    }
}


// OUTPUT

// a : 10
// a : 12
// b : 20
// b : 18

// sum : 71
// a : 66

// sum : 70
// a : 66

// sum : 136
// a : 66