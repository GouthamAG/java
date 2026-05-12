package src.practice.string;

public class ReplaceCharacterInString {
    
    public static void main(String[] args) {
        
        String inputString = "Geeks Gor Geeks";
        Integer index = 6;
        Character ch = 'F';
        inputString = inputString.substring(0, index) + ch + inputString.substring(index+1);
        System.out.println(inputString);
    }
}
