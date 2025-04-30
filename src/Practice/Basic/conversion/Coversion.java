package src.practice.basic.conversion;

public class Coversion {
    
    public static void main(String[] args) {
        boolean value = true;
        String stringValue = Boolean.toString(value);
        System.out.println(stringValue);

        String string1 = "12456.7865";
        double double1 = Double.parseDouble(string1);
        System.out.println(double1);

        double double2 = Double.valueOf(string1);
        System.out.println(double2);
        
        double double3 = new Double(string1);
        System.out.println(double3);

        int i = 97;
        char ch = (char)i;
        System.out.println(ch);

        char ch1 = '8';
        int i1 = Integer.parseInt(String.valueOf(ch1));
        System.out.println(i1);
    }
}
