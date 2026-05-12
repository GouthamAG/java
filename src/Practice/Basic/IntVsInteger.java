package src.practice.basic;
public class IntVsInteger {
    public static void main(String[] args) {
        int x = 78;
        Integer y = Integer.valueOf(78);

        int x1 = 780;
        Integer y1 = Integer.valueOf(780);

        System.out.println(x==y);     // true : int==int    // unboxing (Integer --> int)
        System.out.println(x1==y1);   // true : int==int    // unboxing (Integer --> int)


        Integer x11 = 78;               // autoboxing (int --> Integer)
        Integer y11 = Integer.valueOf(78);

        Integer x12 = 780;              // autoboxing (int --> Integer)
        Integer y12 = Integer.valueOf(780);

        System.out.println(x11==y11);     // true : Integer==Integer  //caching      : same object reference
        System.out.println(x12==y12);   // false : Integer==Integer  //No caching  : different object reference

        
        System.out.println(x11.equals(y11));     // true : Integer==Integer  //value comparison
        System.out.println(x12.equals(y12));   // true : Integer==Integer  //value comparison
    }
}
