package src.practice.exception_handling;


public class ThrowDemo {
    
    public static void fun(){
        try{
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e){
            System.out.println("Caught in fun");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("Caught in main");
        }
    }

}
