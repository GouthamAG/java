package src.practice.string;

public class Demo2 {
    
    public static void main(String[] args) {
        
        String str1 = new String("Goutham");
        String reverseString = "";

        for(int i = str1.length()-1; i >= 0; i--){
            char ch = str1.charAt(i);
            reverseString = reverseString.concat(Character.toString(ch));
        }

        System.out.println(reverseString);

    }
}
