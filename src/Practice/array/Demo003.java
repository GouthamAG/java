package src.practice.array;

public class Demo003 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        StringBuilder t = new StringBuilder();
        t = s.append("World");

        System.out.println("s : " + s );
        System.out.println("t : " + t );
    }
}
