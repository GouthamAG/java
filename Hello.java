package java;
class Car{

    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
}



class Hello{
    public static void main(String[] args){
        System.out.println("Hello World!!!");

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Is Java fun ? " + b1);
        System.out.println("Is Fish Tasty ? " + b2);

        int a = 10;
        int b = 20;

        System.out.println(a+b);

        char c = 'G';
        int i = 89;
        byte d = 4;
        short s = 56;
        double d1 = 4.355453532;
        float f = 4.7333434f;

        long l = 12121;

        System.out.println("char: " + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + d);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d1);
        System.out.println("long: " + l);

        Car my_car = new Car("Honda", 2021);

        System.out.println(my_car.model);
        System.out.println(my_car.year);



    }
}