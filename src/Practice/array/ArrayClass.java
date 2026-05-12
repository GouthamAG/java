package src.practice.array;

import java.util.Arrays;
import java.util.List;

public class ArrayClass {

    public static void main(String[] args) {
        
        Integer [] arr = {5,1,4,3,2};
        for(int i=0; i<arr.length; i++){    // 5 1 4 3 2
            System.out.print(arr[i] + " ");    
        }
        System.out.println();

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list); // [5, 1, 4, 3, 2]

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){   // 1 2 3 4 5 
            System.out.print(arr[i] + " ");    
        }
        System.out.println();

        int index = Arrays.binarySearch(arr, 4);
        System.out.println(index);

        Integer b [] = Arrays.copyOf(arr, arr.length+3);  // 1 2 3 4 5 null null null
        for(int i=0; i<b.length; i++){   
            System.out.print(b[i] + " ");    
        }
        System.out.println();

        Integer c [] = {1,2,30,4,5};
        int diff = Arrays.compare(b, c); 
        System.out.println(diff);       //-1

        Boolean boolVal = Arrays.equals(arr, arr);
        System.out.println(boolVal);    //true

        Integer b11[] = {1,2,3,4,5};
        Integer c11[] = {1,2,null,4,5};

        int diff1 = Arrays.compare(b11, c11);
        System.out.println(diff1);

        String bStr = Arrays.toString(b);
        System.out.println(bStr);

        Integer z[] = {1,2,3,4,5};
        Arrays.fill(z, 90);
        System.out.println(Arrays.toString(z)); // "[90, 90, 90, 90, 90]"


    }
}
