package src.practice.oop;

abstract class Abstract {
    public static int I = 0;

    public int A1 = 90;

    abstract void printHello();

    abstract void printHi();

    static void printValueOfI(){
        System.out.println("I : " + I);
    }

    void printA1(){
        System.out.println("A1 : " + A1);
    }
}

class A extends Abstract{

    void printHello(){
        System.out.println("Hello");
    }

    void printHi(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        A a = new A();
        a.printHello();
        a.printHi();
        A.printValueOfI();
        a.printA1();
    }
}

