package src.practice.exception_handling;

import java.sql.SQLException;

public class ThrowsDemo {
    
    static void fun(int n) throws IllegalAccessException, SQLException
    {
        System.out.println("Inside fun(). ");

        if(n==1){
            throw new IllegalAccessException("demo");
        } else {
            throw new SQLException("demo");
        }
    }


    public static void main(String args[])
    {
        try {
            fun(1);
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
        catch (SQLException e){
            System.out.println("Caught in main.");
        }
    }
}

