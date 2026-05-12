package src.practice.array;

import java.util.Arrays;

public class SearchTechnique1 {
    
    public static Boolean search(Integer[] arr, Integer key){
        int index = Arrays.binarySearch(arr, key);
        if(index > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Integer arr[] =  {3, 5, 7, 2, 6, 10};
        Integer key = 7;
        System.out.println("Is " + key + " found in an array: " + search(arr, key));
    }
}
