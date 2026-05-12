package src.practice.array;

import java.util.Arrays;

public class FindLargestElem {

    public static int findLargestElem(int[] arr){
        // // Method 1
        // int max = arr[0];

        // for(int elem:arr){
        //     if(elem > max){
        //         max = elem;
        //     }
        // }
        // return max;

        // Method 2
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        // Input: arr = { 10, 3, 5, 7, 2, 12}
        // Output: 12
        int []arr = { 10, 3, 5, 7, 2, 12};
        System.out.println(findLargestElem(arr));
        
    }
    
}
