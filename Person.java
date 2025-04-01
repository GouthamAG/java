package java;
public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show_details(){
        System.out.println("Name of the person is : " + this.name);
        System.out.println("Age of the person is : " + this.age);
    }

    public void change_name(String name){
        this.name = name;
    }

    public static void main(String[] args){

        Person A = new Person("Goutham", 27);
        Person B = new Person("Meghana", 23);

        A.show_details();
        B.show_details();

        A.change_name("Gaurav");
        A.show_details();


    }

    
}

