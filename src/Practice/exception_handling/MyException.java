package src.practice.exception_handling;

public class MyException extends Exception {
    
    MyException(){}

    MyException(String str){
        super(str);
    }

    private String [] name = {"Name1", "Name2", "Name3", "Name4"};

    private Integer [] accBal = {13124, 2355, 999, 5555};

    public static void main(String[] args) {
        try{
            MyException m = new MyException();
            System.out.println("Name\tBalance");
            for(int i = 0; i < m.name.length; i++){
                System.out.printf("%s\t%d\n", m.name[i], m.accBal[i]);
                if(m.accBal[i] < 1000){
                    throw new MyException("Balance is less than 1000");
                }
            }
        } catch(MyException m){
            m.printStackTrace();
            System.out.println(m.getMessage());
        }
        
    }
}

