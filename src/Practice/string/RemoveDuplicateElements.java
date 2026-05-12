package src.practice.string;

public class RemoveDuplicateElements {
    
    public static void main(String[] args) {
     
        String inpuString = "Programming";
        String resulString = "";

        for(int i=0; i<inpuString.length(); i++){
            String ch = Character.toString(inpuString.charAt(i));

            if(!resulString.contains(ch)){
                resulString = resulString.concat(ch);
            }
        }
        System.out.println(resulString);
    }
}