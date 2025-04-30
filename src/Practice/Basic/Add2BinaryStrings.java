package src.practice.basic;

public class Add2BinaryStrings{

    public static String add2BinaryStrings(String string1, String string2){
        
        Integer int1 = Integer.parseInt(string1, 2);
        Integer int2 = Integer.parseInt(string2, 2);
        Integer sum = int1 + int2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String[] args) {
        
        String string1 = "10";
        String string2 = "01";

        System.out.println("Result = " + add2BinaryStrings(string1, string2));
    }
}