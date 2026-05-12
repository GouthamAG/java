package src.practice.string;

public class StringMethodsPractice {

    public static void main(String[] args) {
        String s = new String("Hello world!!!");
        System.out.println("s.length() : " + s.length());    

        String s1 = s.concat(" New");
        System.out.println("s1 : " + s1);

        int n = s1.length();
        String temp = "";
        for(int i = 0; i < n-4; i++){
            temp = temp.concat(Character.toString(s1.charAt(i)));
        }

        System.out.println("temp : " + temp);

        // System.out.printf("%-15s%s\n",new String("temp: "),temp);
        System.out.println("temp.length() : " + temp.length());

        String sub = temp.substring(0, 5);
        System.out.println(sub);

        Boolean result = s.equals(temp);
        System.out.println(result);

        Integer resInteger = s.compareTo(temp);
        System.out.println(resInteger);

        resInteger = sub.compareTo(s);
        System.out.println(resInteger);

        String replace = temp.replace('l', 'x');
        System.out.println(replace);
    }

}
