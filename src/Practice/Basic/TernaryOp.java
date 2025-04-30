package src.practice.basic;

public class TernaryOp {
 
    public static void main(String[] args){
        int a = 10, b = 20, c = 5;

        // int result = ((a>b)?(a>c)?a:c:(b>c)?b:c);

        int result = ((a>b)?(a>c)?a:c:(b>c)?b:c);

        System.out.println(result);


    }
}

// OUTPUT
// 20