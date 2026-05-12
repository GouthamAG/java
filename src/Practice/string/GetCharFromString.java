package src.practice.string;

public class GetCharFromString {
//     Input: str = "Geeks", index = 2
// Output: e

    public static void main(String[] args) {
        String str = "Geeks";
        int index = 2;

        // Method 1
        Character ch = str.charAt(index);
        System.out.println(ch);

        // Method 2
        ch = str.toCharArray()[index];
        System.out.println(ch);
    }
}
